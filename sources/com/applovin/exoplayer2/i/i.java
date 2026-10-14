package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7073a = new i() { // from class: com.applovin.exoplayer2.i.i.1
        @Override // com.applovin.exoplayer2.i.i
        public boolean a(v vVar) {
            String str = vVar.f8198l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // com.applovin.exoplayer2.i.i
        public g b(v vVar) {
            String str = vVar.f8198l;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/dvbsubs":
                        return new com.applovin.exoplayer2.i.b.a(vVar.f8200n);
                    case "application/pgs":
                        return new com.applovin.exoplayer2.i.c.a();
                    case "application/x-mp4-vtt":
                        return new com.applovin.exoplayer2.i.i.a();
                    case "text/vtt":
                        return new com.applovin.exoplayer2.i.i.g();
                    case "application/x-quicktime-tx3g":
                        return new com.applovin.exoplayer2.i.h.a(vVar.f8200n);
                    case "text/x-ssa":
                        return new com.applovin.exoplayer2.i.e.a(vVar.f8200n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new com.applovin.exoplayer2.i.a.a(str, vVar.D, 16000L);
                    case "text/x-exoplayer-cues":
                        return new c();
                    case "application/cea-708":
                        return new com.applovin.exoplayer2.i.a.b(vVar.D, vVar.f8200n);
                    case "application/x-subrip":
                        return new com.applovin.exoplayer2.i.f.a();
                    case "application/ttml+xml":
                        return new com.applovin.exoplayer2.i.g.c();
                }
            }
            throw new IllegalArgumentException(i.f.a("Attempted to create decoder for unsupported MIME type: ", str));
        }
    };

    boolean a(v vVar);

    g b(v vVar);
}
