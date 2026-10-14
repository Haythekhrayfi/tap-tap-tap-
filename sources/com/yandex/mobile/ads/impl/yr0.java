package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.widget.PopupMenu;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class yr0 {
    public static void a(PopupMenu popupMenu) {
        if (Build.VERSION.SDK_INT >= 29) {
            popupMenu.setForceShowIcon(true);
            return;
        }
        Object obj = null;
        try {
            Field declaredField = popupMenu.getClass().getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            obj = declaredField.get(popupMenu);
            declaredField.setAccessible(false);
        } catch (Exception unused) {
            x60.f("Field %s isn't found when using reflection", "mPopup");
        }
        if (obj != null) {
            try {
                obj.getClass().getMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
            } catch (Exception unused2) {
                x60.f("Method setForceShowIcon isn't found when using reflection", new Object[0]);
            }
        }
    }
}
