package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f6013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f6014b = new com.applovin.exoplayer2.l.x(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6015c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ag f6017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6024l;

    public t(j jVar) {
        this.f6013a = jVar;
    }

    private void a(int i10) {
        this.f6015c = i10;
        this.f6016d = 0;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f6016d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.e(iMin);
        } else {
            yVar.a(bArr, this.f6016d, iMin);
        }
        int i11 = this.f6016d + iMin;
        this.f6016d = i11;
        return i11 == i10;
    }

    private boolean b() {
        this.f6014b.a(0);
        int iC = this.f6014b.c(24);
        if (iC != 1) {
            com.applovin.exoplayer2.l.q.c("PesReader", "Unexpected start code prefix: " + iC);
            this.f6022j = -1;
            return false;
        }
        this.f6014b.b(8);
        int iC2 = this.f6014b.c(16);
        this.f6014b.b(5);
        this.f6023k = this.f6014b.e();
        this.f6014b.b(2);
        this.f6018f = this.f6014b.e();
        this.f6019g = this.f6014b.e();
        this.f6014b.b(6);
        int iC3 = this.f6014b.c(8);
        this.f6021i = iC3;
        if (iC2 == 0) {
            this.f6022j = -1;
        } else {
            int i10 = ((iC2 + 6) - 9) - iC3;
            this.f6022j = i10;
            if (i10 < 0) {
                StringBuilder sbA = defpackage.a.a("Found negative packet payload size: ");
                sbA.append(this.f6022j);
                com.applovin.exoplayer2.l.q.c("PesReader", sbA.toString());
                this.f6022j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.f6014b.a(0);
        this.f6024l = -9223372036854775807L;
        if (this.f6018f) {
            this.f6014b.b(4);
            long jC = ((long) this.f6014b.c(3)) << 30;
            this.f6014b.b(1);
            long jC2 = jC | ((long) (this.f6014b.c(15) << 15));
            this.f6014b.b(1);
            long jC3 = jC2 | ((long) this.f6014b.c(15));
            this.f6014b.b(1);
            if (!this.f6020h && this.f6019g) {
                this.f6014b.b(4);
                long jC4 = ((long) this.f6014b.c(3)) << 30;
                this.f6014b.b(1);
                long jC5 = jC4 | ((long) (this.f6014b.c(15) << 15));
                this.f6014b.b(1);
                long jC6 = jC5 | ((long) this.f6014b.c(15));
                this.f6014b.b(1);
                this.f6017e.b(jC6);
                this.f6020h = true;
            }
            this.f6024l = this.f6017e.b(jC3);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public final void a() {
        this.f6015c = 0;
        this.f6016d = 0;
        this.f6020h = false;
        this.f6013a.a();
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f6017e = agVar;
        this.f6013a.a(jVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0044 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0077 -> B:37:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.applovin.exoplayer2.e.i.ad
    public final void a(com.applovin.exoplayer2.l.y r9, int r10) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.t.a(com.applovin.exoplayer2.l.y, int):void");
    }
}
