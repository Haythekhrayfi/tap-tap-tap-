package com.inscode.autoclicker.base;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class SecurityUtils {
    public static final String INVALID = "UjA1ckk";
    private static final String S = "UjA1ckk5bmJleWVrSmtCRTNWVGRvSkwzcmswPQ";
    public static final String VALID = "CRTNWVG";

    public static String initializeSignature(Context context) {
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                if (Base64.encodeToString(messageDigest.digest(), 0).replace("\n", "").replace("\r", "").contains(new String(Base64.decode("UjA1ckk5bmJleWVrSmtCRTNWVGRvSkwzcmswPQ==", 0), StandardCharsets.UTF_8))) {
                    return VALID;
                }
            }
            return INVALID;
        } catch (Exception unused) {
            return INVALID;
        }
    }

    public static boolean verifyInstaller(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null && installerPackageName.startsWith("com.android.vending");
    }
}
