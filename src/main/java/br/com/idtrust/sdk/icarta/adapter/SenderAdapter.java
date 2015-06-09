package br.com.idtrust.sdk.icarta.adapter;

import br.com.idtrust.sdk.icarta.model.EmailAddress;
import br.com.idtrust.sdk.icarta.ws.soap.v2.Sender;


class SenderAdapter implements Adapter<EmailAddress, Sender> {
    @Override
    public Sender adapt(EmailAddress from) {
        Sender sender = new Sender();
        sender.setName(from.getName());
        sender.setEmail(from.getEmail());
        return sender;
    }
}
