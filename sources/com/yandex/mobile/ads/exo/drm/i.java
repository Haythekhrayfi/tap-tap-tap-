package com.yandex.mobile.ads.exo.drm;

import android.media.MediaDrm;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.impl.da1;

/* JADX INFO: loaded from: classes.dex */
final class i {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        int iA = da1.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (iA != 2 && iA != 4) {
            if (iA != 10) {
                if (iA != 7) {
                    if (iA != 8) {
                        switch (iA) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (iA) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                }
            }
            return 6004;
        }
        return 6005;
    }
}
