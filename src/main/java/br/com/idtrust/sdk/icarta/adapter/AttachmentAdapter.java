package br.com.idtrust.sdk.icarta.adapter;

import java.util.Base64;

import br.com.idtrust.sdk.icarta.model.Attachment;

class AttachmentAdapter implements
        Adapter<Attachment, br.com.idtrust.sdk.icarta.ws.soap.v2.Attachment> {

    @Override
    public br.com.idtrust.sdk.icarta.ws.soap.v2.Attachment adapt(
            Attachment from) {
        br.com.idtrust.sdk.icarta.ws.soap.v2.Attachment attachment = new br.com.idtrust.sdk.icarta.ws.soap.v2.Attachment();
        attachment.setFileName(from.getFileName());
        attachment.setContentType(from.getContentType());
        attachment.setContent(
                Base64.getEncoder().encodeToString(from.getContent()));
        return attachment;
    }
}
