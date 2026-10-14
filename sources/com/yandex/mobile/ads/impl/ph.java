package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ph implements gs0<Character> {

    public static abstract class a extends ph {
        @Override // com.yandex.mobile.ads.impl.gs0
        @Deprecated
        public final boolean apply(Character ch2) {
            return a(ch2.charValue());
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f24059a;

        public b(char c10) {
            this.f24059a = c10;
        }

        @Override // com.yandex.mobile.ads.impl.ph
        public final boolean a(char c10) {
            return c10 == this.f24059a;
        }

        public final String toString() {
            StringBuilder sbA = v60.a("CharMatcher.is('");
            char c10 = this.f24059a;
            char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            sbA.append(String.copyValueOf(cArr));
            sbA.append("')");
            return sbA.toString();
        }
    }

    public static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24060a = (String) fs0.a("CharMatcher.none()");

        public final String toString() {
            return this.f24060a;
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24061b = new d();

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.ph
        public final int a(CharSequence charSequence, int i10) {
            fs0.b(i10, charSequence.length());
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.ph
        public final boolean a(char c10) {
            return false;
        }
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        fs0.b(i10, length);
        while (i10 < length) {
            if (a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean a(char c10);
}
