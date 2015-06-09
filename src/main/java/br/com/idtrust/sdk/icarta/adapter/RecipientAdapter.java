package br.com.idtrust.sdk.icarta.adapter;

import br.com.idtrust.sdk.icarta.model.Recipient;
import br.com.idtrust.sdk.icarta.ws.soap.v2.TypeRecipient;

class RecipientAdapter implements Adapter<Recipient, br.com.idtrust.sdk.icarta.ws.soap.v2.Recipient> {


    @Override
    public br.com.idtrust.sdk.icarta.ws.soap.v2.Recipient adapt(Recipient from) {
        br.com.idtrust.sdk.icarta.ws.soap.v2.Recipient recipient
                = new br.com.idtrust.sdk.icarta.ws.soap.v2.Recipient();
        recipient.setName(from.getEmailAddress().getName());
        recipient.setEmail(from.getEmailAddress().getEmail());
        recipient.setType(TypeRecipient.valueOf(from.getType()
                .name()));
        return recipient;
    }
}
