package com.yandex.mobile.ads.impl;

import android.content.Intent;
import android.net.Uri;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class ks0 {
    public static Intent a(js0 js0Var) {
        Serializable serializable;
        String strC = js0Var.c();
        String strB = js0Var.b();
        Map<String, Object> mapA = js0Var.a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strC));
        intent.addFlags(1342177280);
        intent.setPackage(strB);
        if (mapA != null) {
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    serializable = (Boolean) value;
                } else if (value instanceof Integer) {
                    serializable = (Integer) value;
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                }
                intent.putExtra(key, serializable);
            }
        }
        return intent;
    }
}
