package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10066b;

    public AppLovinError(int i10, String str) {
        this.f10065a = i10;
        this.f10066b = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public int getCode() {
        return this.f10065a;
    }

    public String getMessage() {
        return this.f10066b;
    }

    public int hashCode() {
        int code = getCode() + 59;
        String message = getMessage();
        return (code * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinError(code=");
        sbA.append(getCode());
        sbA.append(", message=");
        sbA.append(getMessage());
        sbA.append(")");
        return sbA.toString();
    }
}
