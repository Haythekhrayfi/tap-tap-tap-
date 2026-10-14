package com.yandex.mobile.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildConfigFieldProvider {
    public static final BuildConfigFieldProvider INSTANCE = new BuildConfigFieldProvider();

    private BuildConfigFieldProvider() {
    }

    public static final String getAdUrlPath() {
        return "v4/ad";
    }

    public static /* synthetic */ void getAdUrlPath$annotations() {
    }

    public static final String getBuildNumber() {
        return "30952";
    }

    public static /* synthetic */ void getBuildNumber$annotations() {
    }

    public static final String getDivKitVersion() {
        return "25.2.0";
    }

    public static /* synthetic */ void getDivKitVersion$annotations() {
    }

    public static final String getLocalUrl() {
        return "";
    }

    public static /* synthetic */ void getLocalUrl$annotations() {
    }

    public static final String getMockUrl() {
        return "";
    }

    public static /* synthetic */ void getMockUrl$annotations() {
    }

    public static final String getProdUrl() {
        return "";
    }

    public static /* synthetic */ void getProdUrl$annotations() {
    }

    public static final String getVersion() {
        return "5.10.0";
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final String getVersionName() {
        return "5.10.0";
    }

    public static /* synthetic */ void getVersionName$annotations() {
    }

    public static final boolean isAutotest() {
        return false;
    }

    public static /* synthetic */ void isAutotest$annotations() {
    }

    public static final boolean isDebug() {
        return false;
    }

    public static /* synthetic */ void isDebug$annotations() {
    }

    public static final boolean isInternalBuild() {
        return false;
    }

    public static /* synthetic */ void isInternalBuild$annotations() {
    }

    public static final boolean isInternalOrAutotestBuild() {
        return isInternalBuild() || isAutotest();
    }

    public static /* synthetic */ void isInternalOrAutotestBuild$annotations() {
    }

    public static final boolean isMavenBuild() {
        return true;
    }

    public static /* synthetic */ void isMavenBuild$annotations() {
    }

    public static final boolean isWithLogs() {
        return false;
    }

    public static /* synthetic */ void isWithLogs$annotations() {
    }
}
