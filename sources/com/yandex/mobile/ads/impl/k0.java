package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    private static final Map<Integer, String> f22211a = kc.f0.e(new jc.h(16, "ActivityInfo.CONFIG_KEYBOARD"), new jc.h(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), new jc.h(128, "ActivityInfo.CONFIG_ORIENTATION"), new jc.h(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), new jc.h(512, "ActivityInfo.CONFIG_UI_MODE"), new jc.h(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), new jc.h(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    public static void a(ActivityInfo activityInfo) {
        Object obj;
        fd.j0.i(activityInfo, "adActivity");
        Map<Integer, String> map = f22211a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int iIntValue = next.getKey().intValue();
            String value = next.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                obj = value;
            }
            arrayList.add(obj);
        }
        for (Object obj2 : arrayList) {
            if (((String) obj2) != null) {
                obj = obj2;
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return;
        }
        String str2 = String.format("com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.", Arrays.copyOf(new Object[]{str}, 1));
        fd.j0.h(str2, "format(this, *args)");
        throw new n60(str2);
    }
}
