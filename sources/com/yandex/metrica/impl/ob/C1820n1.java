package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1820n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f16907a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16908b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    private boolean a(List<StackTraceElement> list, Pattern pattern) {
        Iterator<StackTraceElement> it = list.iterator();
        while (it.hasNext()) {
            if (pattern.matcher(it.next().getClassName()).find()) {
                return true;
            }
        }
        return false;
    }

    public boolean a(List<StackTraceElement> list) {
        return a(list, f16907a);
    }

    public boolean b(List<StackTraceElement> list) {
        return a(list, f16908b);
    }
}
