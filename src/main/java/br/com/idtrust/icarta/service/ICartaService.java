package br.com.idtrust.icarta.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.idtrust.icarta.model.AttachmentICarta;
import br.com.idtrust.icarta.model.EmailAddress;
import br.com.idtrust.icarta.model.EmailICarta;
import br.com.idtrust.icarta.model.RecipentICarta;
import br.com.idtrust.icarta.ws.v200.Attachment;
import br.com.idtrust.icarta.ws.v200.Credentials;
import br.com.idtrust.icarta.ws.v200.EmailRastreadoIntegracao;
import br.com.idtrust.icarta.ws.v200.EmailRastreadoIntegracaoService;
import br.com.idtrust.icarta.ws.v200.Recipient;
import br.com.idtrust.icarta.ws.v200.SendEmail;
import br.com.idtrust.icarta.ws.v200.SendEmailResponse;
import br.com.idtrust.icarta.ws.v200.SendTrackedEmailRequest;
import br.com.idtrust.icarta.ws.v200.SendTrackedEmailRequest.TrackedEmails;
import br.com.idtrust.icarta.ws.v200.Sender;
import br.com.idtrust.icarta.ws.v200.TrackedEmail;
import br.com.idtrust.icarta.ws.v200.TrackedEmail.Attachments;
import br.com.idtrust.icarta.ws.v200.TrackedEmail.Recipients;
import br.com.idtrust.icarta.ws.v200.TrackedResponse;
import br.com.idtrust.icarta.ws.v200.TypeRecipient;

import com.itextpdf.text.pdf.codec.Base64;

public class ICartaService implements Serializable {

    private static final long serialVersionUID = -1542564663756368128L;

    private Credentials credentials;

    private ICartaService() {
        credentials = new Credentials();
    }

    public ICartaService(String appId, String appSecret) {
        this();
        createCredentials(appId, appSecret);
    }

    public void sendEmail(EmailICarta iCarta) {

        try {
            SendTrackedEmailRequest sendTrackedEmail = new SendTrackedEmailRequest();
            sendTrackedEmail.setCredentials(credentials);

            TrackedEmails trackedEmails = new TrackedEmails();
            trackedEmails.getTrackedEmail().add(createTrackedEmail(iCarta));

            sendTrackedEmail.setTrackedEmails(trackedEmails);

            EmailRastreadoIntegracaoService service = new EmailRastreadoIntegracaoService();
            EmailRastreadoIntegracao ws = service
                    .getEmailRastreadoIntegracaoPort();

            SendEmail sendEmail = new SendEmail();
            sendEmail.setSendTrackedEmail(sendTrackedEmail);

            SendEmailResponse response = ws.sendEmail(sendEmail);

            System.out.println("#####################");
            System.out.println(response.getSendTrackedEmailResponse()
                    .getDescription());
            System.out.println(response.getSendTrackedEmailResponse()
                    .getStatus());
            System.out.println("#####################");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createCredentials(String appId, String appSecret) {
        credentials.setAppId(appId);
        credentials.setAppSecret(appSecret);
    }

    private TrackedEmail createTrackedEmail(EmailICarta iCarta) {
        TrackedEmail trackedEmail = new TrackedEmail();
        trackedEmail.setSubject(iCarta.getSubject());
        trackedEmail.setSender(createSender(iCarta.getFrom()));
        trackedEmail.setContent(iCarta.getMessage());
        trackedEmail.setMessageId(iCarta.getEmailUniqueId());
        trackedEmail.setTrackedResponse(TrackedResponse.NO);

        trackedEmail.setRecipients(createRecipients(iCarta.getRecipients()));
        trackedEmail.setAttachments(createAttachments(iCarta.getAttachments()));

        return trackedEmail;
    }

    private Sender createSender(EmailAddress from) {
        Sender sender = new Sender();
        sender.setName(from.getName());
        sender.setEmail(from.getEmail());

        return sender;
    }

    private Recipients createRecipients(List<RecipentICarta> recipientsICarta) {

        Recipients rcpts = new Recipients();

        List<Recipient> recipients = new ArrayList<Recipient>();

        for (RecipentICarta iCartaRecipient : recipientsICarta) {
            Recipient recipient = new Recipient();
            recipient.setName(iCartaRecipient.getEmailAddress().getName());
            recipient.setEmail(iCartaRecipient.getEmailAddress().getEmail());
            recipient.setType(TypeRecipient.valueOf(iCartaRecipient.getType()
                    .name()));
            recipients.add(recipient);
        }
        rcpts.getRecipient().addAll(recipients);

        return rcpts;
    }

    private Attachments createAttachments(
            List<AttachmentICarta> attachmentsICarta) {

        Attachments attachs = new Attachments();

        List<Attachment> attachments = new ArrayList<Attachment>();

        for (AttachmentICarta iCartaAttachment : attachmentsICarta) {
            Attachment attachment = new Attachment();
            attachment.setFileName(iCartaAttachment.getFileName());
            attachment.setContentType(iCartaAttachment.getContentType());
            attachment.setContent(Base64.encodeBytes(iCartaAttachment
                    .getContent()));

            attachments.add(attachment);
        }
        attachs.getAttachment().addAll(attachments);

        return attachs;
    }

}
