package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f25634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f25635c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final LinkedHashMap f25636d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uh f25637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uh f25638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uh f25639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uh f25640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uh f25641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uh f25642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uh f25643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final uh f25644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uh f25645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uh f25646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uh f25647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final uh f25648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uh f25649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uh f25650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uh f25651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uh f25652t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25653a;

    public static final class a implements Comparator<String> {
        /* JADX WARN: Code duplicated, block: B:13:0x003d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x003f A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            fd.j0.i(str3, "a");
            fd.j0.i(str4, "b");
            int iMin = Math.min(str3.length(), str4.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str3.charAt(i10);
                char cCharAt2 = str4.charAt(i10);
                if (cCharAt != cCharAt2) {
                    if (fd.j0.k(cCharAt, cCharAt2) < 0) {
                        return -1;
                    }
                    return 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(int i10) {
            this();
        }

        public static a a() {
            return uh.f25635c;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0060 A[Catch: all -> 0x006e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0014, B:7:0x0023, B:8:0x0035, B:13:0x0056, B:15:0x0060, B:16:0x0065, B:9:0x003a, B:11:0x0042), top: B:22:0x0001 }] */
        public final synchronized uh a(String str) {
            uh uhVar;
            String string;
            StringBuilder sbA;
            fd.j0.i(str, "javaName");
            uhVar = (uh) ((LinkedHashMap) uh.f25636d).get(str);
            if (uhVar == null) {
                Map map = uh.f25636d;
                int i10 = 0;
                if (ed.q.u(str, "TLS_", false, 2)) {
                    sbA = v60.a("SSL_");
                    String strSubstring = str.substring(4);
                    fd.j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sbA.append(strSubstring);
                } else {
                    if (ed.q.u(str, "SSL_", false, 2)) {
                        sbA = v60.a("TLS_");
                        String strSubstring2 = str.substring(4);
                        fd.j0.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        sbA.append(strSubstring2);
                    } else {
                        string = str;
                    }
                    uhVar = (uh) ((LinkedHashMap) map).get(string);
                    if (uhVar == null) {
                        uhVar = new uh(str, i10);
                    }
                    uh.f25636d.put(str, uhVar);
                }
                string = sbA.toString();
                uhVar = (uh) ((LinkedHashMap) map).get(string);
                if (uhVar == null) {
                    uhVar = new uh(str, i10);
                }
                uh.f25636d.put(str, uhVar);
            }
            return uhVar;
        }
    }

    static {
        int i10 = 0;
        f25634b = new b(i10);
        uh uhVarA = th.a("SSL_RSA_WITH_DES_CBC_SHA", th.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", th.a("SSL_RSA_WITH_RC4_128_SHA", th.a("SSL_RSA_WITH_RC4_128_MD5", th.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", th.a("SSL_RSA_WITH_NULL_SHA", th.a("SSL_RSA_WITH_NULL_MD5", new uh("SSL_RSA_WITH_NULL_MD5", i10), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        f25636d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", uhVarA);
        f25637e = uhVarA;
        uh uhVarA2 = th.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", th.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", th.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", th.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", th.a("TLS_KRB5_WITH_RC4_128_MD5", th.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", th.a("TLS_KRB5_WITH_DES_CBC_MD5", th.a("TLS_KRB5_WITH_RC4_128_SHA", th.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", th.a("TLS_KRB5_WITH_DES_CBC_SHA", th.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", th.a("SSL_DH_anon_WITH_DES_CBC_SHA", th.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", th.a("SSL_DH_anon_WITH_RC4_128_MD5", th.a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", th.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", th.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", th.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", th.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", th.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", th.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new uh("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", i10), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0), "SSL_DH_anon_WITH_RC4_128_MD5", 0), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        f25636d.put("TLS_RSA_WITH_AES_128_CBC_SHA", uhVarA2);
        f25638f = uhVarA2;
        uh uhVarA3 = th.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", th.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", th.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new uh("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", i10), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        f25636d.put("TLS_RSA_WITH_AES_256_CBC_SHA", uhVarA3);
        f25639g = uhVarA3;
        uh uhVarA4 = th.a("TLS_RSA_WITH_SEED_CBC_SHA", th.a("TLS_PSK_WITH_AES_256_CBC_SHA", th.a("TLS_PSK_WITH_AES_128_CBC_SHA", th.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", th.a("TLS_PSK_WITH_RC4_128_SHA", th.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", th.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", th.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", th.a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", th.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", th.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", th.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", th.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", th.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", th.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", th.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", th.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", th.a("TLS_RSA_WITH_AES_256_CBC_SHA256", th.a("TLS_RSA_WITH_AES_128_CBC_SHA256", th.a("TLS_RSA_WITH_NULL_SHA256", th.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", th.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", th.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new uh("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", i10), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        f25636d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", uhVarA4);
        f25640h = uhVarA4;
        uh uhVar = new uh("TLS_RSA_WITH_AES_256_GCM_SHA384", i10);
        f25636d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", uhVar);
        f25641i = uhVar;
        uh uhVarA5 = th.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", th.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", th.a("TLS_ECDHE_RSA_WITH_NULL_SHA", th.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", th.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", th.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", th.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", th.a("TLS_ECDH_RSA_WITH_NULL_SHA", th.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", th.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", th.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", th.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", th.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", th.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", th.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", th.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", th.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", th.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", th.a("TLS_FALLBACK_SCSV", th.a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", th.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", th.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", th.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", th.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", th.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", th.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new uh("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", i10), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0), "TLS_FALLBACK_SCSV", 0), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0), "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        f25636d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", uhVarA5);
        f25642j = uhVarA5;
        uh uhVar2 = new uh("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", i10);
        f25636d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", uhVar2);
        f25643k = uhVar2;
        uh uhVarA6 = th.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", th.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", th.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", th.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", th.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", th.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", th.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", th.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", th.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", th.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", th.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", th.a("TLS_ECDH_anon_WITH_RC4_128_SHA", th.a("TLS_ECDH_anon_WITH_NULL_SHA", new uh("TLS_ECDH_anon_WITH_NULL_SHA", i10), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0);
        f25636d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", uhVarA6);
        f25644l = uhVarA6;
        uh uhVar3 = new uh("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", i10);
        f25636d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", uhVar3);
        f25645m = uhVar3;
        uh uhVarA7 = th.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", th.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new uh("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", i10), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        f25636d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", uhVarA7);
        f25646n = uhVarA7;
        uh uhVar4 = new uh("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", i10);
        f25636d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", uhVar4);
        f25647o = uhVar4;
        uh uhVarA8 = th.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", th.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", th.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", th.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new uh("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", i10), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f25636d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", uhVarA8);
        f25648p = uhVarA8;
        uh uhVar5 = new uh("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", i10);
        f25636d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", uhVar5);
        f25649q = uhVar5;
        uh uhVarA9 = th.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", th.a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new uh("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", i10), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        f25636d.put("TLS_AES_128_GCM_SHA256", uhVarA9);
        f25650r = uhVarA9;
        uh uhVar6 = new uh("TLS_AES_256_GCM_SHA384", i10);
        f25636d.put("TLS_AES_256_GCM_SHA384", uhVar6);
        f25651s = uhVar6;
        uh uhVar7 = new uh("TLS_CHACHA20_POLY1305_SHA256", i10);
        f25636d.put("TLS_CHACHA20_POLY1305_SHA256", uhVar7);
        f25652t = uhVar7;
        f25636d.put("TLS_AES_128_CCM_8_SHA256", th.a("TLS_AES_128_CCM_SHA256", new uh("TLS_AES_128_CCM_SHA256", i10), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    private uh(String str) {
        this.f25653a = str;
    }

    public /* synthetic */ uh(String str, int i10) {
        this(str);
    }

    public final String c() {
        return this.f25653a;
    }

    public final String toString() {
        return this.f25653a;
    }
}
