package br.com.idtrust.icarta.model;

import java.io.Serializable;

public class AttachmentICarta implements Serializable {

    private static final long serialVersionUID = 4881254619798012182L;

    private String fileName;
    private String contentType;
    private byte[] content;

    private AttachmentICarta() {
    }

    public AttachmentICarta(String fileName, String contentType, byte[] content) {
        this();
        this.fileName = fileName;
        this.contentType = contentType;
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public byte[] getContent() {
        return content;
    }

}
