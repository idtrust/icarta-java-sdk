package br.com.idtrust.sdk.icarta;

import br.com.idtrust.sdk.icarta.adapter.CredentialsAdapter;
import br.com.idtrust.sdk.icarta.adapter.TrackedEmailAdapter;
import br.com.idtrust.sdk.icarta.model.ICartaCredentials;
import br.com.idtrust.sdk.icarta.model.TrackedEmail;
import br.com.idtrust.sdk.icarta.ws.soap.v2.EmailRastreadoIntegracao;
import br.com.idtrust.sdk.icarta.ws.soap.v2.EmailRastreadoIntegracaoService;
import br.com.idtrust.sdk.icarta.ws.soap.v2.SendEmail;
import br.com.idtrust.sdk.icarta.ws.soap.v2.SendEmailResponse;
import br.com.idtrust.sdk.icarta.ws.soap.v2.SendTrackedEmailRequest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public final class ICartaService implements Serializable {

    private static final long serialVersionUID = -1542564663756368128L;

    private ICartaCredentials credentials;

    public ICartaService(final ICartaCredentials credentials) {
        if (credentials == null) throw new IllegalArgumentException("Credentials cannot be null");
        this.credentials = credentials;
    }

    public SendEmailResponse send(final TrackedEmail trackedEmail) {
        return send(Arrays.asList(new TrackedEmail[]{trackedEmail}));
    }

    public SendEmailResponse send(final List<TrackedEmail> emails) {

        final SendTrackedEmailRequest.TrackedEmails trackedEmails = new SendTrackedEmailRequest.TrackedEmails();
        final SendTrackedEmailRequest sendTrackedEmail = new SendTrackedEmailRequest();

        sendTrackedEmail.setCredentials(new CredentialsAdapter().adapt(credentials));

        for (TrackedEmail trackedEmail : emails) {
            trackedEmails.getTrackedEmail().add(new TrackedEmailAdapter().adapt(trackedEmail));
        }

        sendTrackedEmail.setTrackedEmails(trackedEmails);

        EmailRastreadoIntegracaoService service = new EmailRastreadoIntegracaoService();
        EmailRastreadoIntegracao ws = service
                .getEmailRastreadoIntegracaoPort();

        SendEmail sendEmail = new SendEmail();
        sendEmail.setSendTrackedEmail(sendTrackedEmail);

        return ws.sendEmail(sendEmail);

    }

}
