package com.applovin.exoplayer2.k;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Predicate;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface t extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Predicate<String> f7494a = new Predicate() { // from class: com.applovin.exoplayer2.k.c0
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public final boolean apply(Object obj) {
            return t.a((String) obj);
        }
    };

    public static final class a extends c {
        public a(IOException iOException, l lVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, lVar, 2007, 1);
        }
    }

    public interface b extends i.a {
        @Override // com.applovin.exoplayer2.k.i.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        t a();
    }

    public static class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f7495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7496c;

        public c(l lVar, int i10, int i11) {
            super(a(i10, i11));
            this.f7495b = lVar;
            this.f7496c = i11;
        }

        public c(IOException iOException, l lVar, int i10, int i11) {
            super(iOException, a(i10, i11));
            this.f7495b = lVar;
            this.f7496c = i11;
        }

        public c(String str, l lVar, int i10, int i11) {
            super(str, a(i10, i11));
            this.f7495b = lVar;
            this.f7496c = i11;
        }

        public c(String str, IOException iOException, l lVar, int i10, int i11) {
            super(str, iOException, a(i10, i11));
            this.f7495b = lVar;
            this.f7496c = i11;
        }

        private static int a(int i10, int i11) {
            return (i10 == 2000 && i11 == 1) ? AdError.INTERNAL_ERROR_CODE : i10;
        }

        public static c a(IOException iOException, l lVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = AdError.CACHE_ERROR_CODE;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
            }
            return i11 == 2007 ? new a(iOException, lVar) : new c(iOException, lVar, i11, i10);
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7497d;

        public d(String str, l lVar) {
            super(i.f.a("Invalid content type: ", str), lVar, AdError.INTERNAL_ERROR_2003, 1);
            this.f7497d = str;
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map<String, List<String>> f7500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f7501g;

        public e(int i10, String str, IOException iOException, Map<String, List<String>> map, l lVar, byte[] bArr) {
            super(android.support.v4.media.a.a("Response code: ", i10), iOException, lVar, AdError.INTERNAL_ERROR_2004, 1);
            this.f7498d = i10;
            this.f7499e = str;
            this.f7500f = map;
            this.f7501g = bArr;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f7502a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f7503b;

        public synchronized Map<String, String> a() {
            if (this.f7503b == null) {
                this.f7503b = Collections.unmodifiableMap(new HashMap(this.f7502a));
            }
            return this.f7503b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = Ascii.toLowerCase(str);
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        return ((lowerCase.contains("text") && !lowerCase.contains("text/vtt")) || lowerCase.contains("html") || lowerCase.contains("xml")) ? false : true;
    }
}
