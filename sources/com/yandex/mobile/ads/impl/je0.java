package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface je0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final je0 f22027a = new a();

    public class a implements je0 {
        @Override // com.yandex.mobile.ads.impl.je0
        public final boolean a(yv yvVar) {
            String str = yvVar.f27115l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.yandex.mobile.ads.impl.je0
        public final r11 b(yv yvVar) {
            String str = yvVar.f27115l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new p9();
                    case "application/x-icy":
                        return new m10();
                    case "application/id3":
                        return new n10(null);
                    case "application/x-emsg":
                        return new es();
                    case "application/x-scte35":
                        return new com.yandex.mobile.ads.exo.metadata.scte35.a();
                }
            }
            throw new IllegalArgumentException(fn1.a("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(yv yvVar);

    r11 b(yv yvVar);
}
