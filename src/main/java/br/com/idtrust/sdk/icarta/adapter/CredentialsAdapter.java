package br.com.idtrust.sdk.icarta.adapter;

import br.com.idtrust.sdk.icarta.model.ICartaCredentials;
import br.com.idtrust.sdk.icarta.ws.soap.v2.Credentials;


public class CredentialsAdapter implements Adapter<ICartaCredentials, Credentials> {

    public Credentials adapt(ICartaCredentials iCartaCredentials) {
        Credentials credentials = new Credentials();
        credentials.setAppId(iCartaCredentials.getAppId());
        credentials.setAppSecret(iCartaCredentials.getAppSecret());
        return credentials;
    }
}
