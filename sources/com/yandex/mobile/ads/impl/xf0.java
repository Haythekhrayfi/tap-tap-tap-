package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f26509a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    public static boolean a(String str) {
        return f26509a.matcher(str).find();
    }
}
