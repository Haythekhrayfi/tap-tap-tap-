package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface k51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k51 f22256a = new a();

    public class a implements k51 {
        public final i51 a(yv yvVar) {
            String str = yvVar.f27115l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new er(yvVar.f27117n);
                    case "application/pgs":
                        return new gq0();
                    case "application/x-mp4-vtt":
                        return new of0();
                    case "text/vtt":
                        return new gj1();
                    case "application/x-quicktime-tx3g":
                        return new b91(yvVar.f27117n);
                    case "text/x-ssa":
                        return new d41(yvVar.f27117n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new gh(yvVar.D, str);
                    case "text/x-exoplayer-cues":
                        return new gt();
                    case "application/cea-708":
                        return new hh(yvVar.D, yvVar.f27117n);
                    case "application/x-subrip":
                        return new f51();
                    case "application/ttml+xml":
                        return new v81();
                }
            }
            throw new IllegalArgumentException(fn1.a("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(yv yvVar) {
            String str = yvVar.f27115l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}
