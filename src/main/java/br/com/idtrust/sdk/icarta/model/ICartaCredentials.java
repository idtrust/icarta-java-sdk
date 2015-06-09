package br.com.idtrust.sdk.icarta.model;

public class ICartaCredentials {
    private final String appId;
    private final String appSecret;

    public ICartaCredentials(final String appId, final String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
}
