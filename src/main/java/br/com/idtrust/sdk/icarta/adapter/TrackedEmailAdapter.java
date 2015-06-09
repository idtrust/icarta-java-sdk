package br.com.idtrust.sdk.icarta.adapter;

import br.com.idtrust.sdk.icarta.model.Attachment;
import br.com.idtrust.sdk.icarta.model.Recipient;
import br.com.idtrust.sdk.icarta.model.TrackedEmail;
import br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedResponse;

import java.util.List;

public class TrackedEmailAdapter
        implements Adapter<TrackedEmail, br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail> {

    private SenderAdapter senderAdapter = new SenderAdapter();
    private RecipientAdapter recipientAdapter = new RecipientAdapter();
    private AttachmentAdapter attachmentAdapter = new AttachmentAdapter();

    @Override
    public br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail adapt(TrackedEmail from) {
        br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail trackedEmail
                = new br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail();
        trackedEmail.setSubject(from.getSubject());
        trackedEmail.setSender(senderAdapter.adapt(from.getFrom()));
        trackedEmail.setContent(from.getMessage());
        trackedEmail.setMessageId(from.getUniqueId());
        trackedEmail.setTrackedResponse(TrackedResponse.NO);
        trackedEmail.setRecipients(adaptRecipients(from.getRecipients()));
        trackedEmail.setAttachments(adaptAttachments(from.getAttachments()));
        return trackedEmail;
    }

    private br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail.Recipients adaptRecipients(final List<Recipient> recipients) {

        br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail.Recipients emailRecipients =
                new br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail.Recipients();

        for (Recipient recipient : recipients) {
            br.com.idtrust.sdk.icarta.ws.soap.v2.Recipient emailRecipient = recipientAdapter.adapt(recipient);
            emailRecipients.getRecipient().add(emailRecipient);
        }

        return emailRecipients;
    }

    private br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail.Attachments adaptAttachments(final List<Attachment> attachments) {
        br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail.Attachments emailAttachments
                = new br.com.idtrust.sdk.icarta.ws.soap.v2.TrackedEmail.Attachments();

        for (Attachment attachment : attachments) {
            br.com.idtrust.sdk.icarta.ws.soap.v2.Attachment emailAttachment
                    = attachmentAdapter.adapt(attachment);
            emailAttachments.getAttachment().add(emailAttachment);
        }

        return emailAttachments;
    }
}
