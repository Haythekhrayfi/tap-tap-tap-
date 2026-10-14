package com.applovin.exoplayer2.e.g;

import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Splitter f5581a = Splitter.on(CoreConstants.COLON_CHAR);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Splitter f5582b = Splitter.on('*');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<a> f5583c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5584d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5585e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5588c;

        public a(int i10, long j10, int i11) {
            this.f5586a = i10;
            this.f5587b = j10;
            this.f5588c = i11;
        }
    }

    private static int a(String str) throws ai {
        Objects.requireNonNull(str);
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ai.b("Invalid SEF name", null);
        }
    }

    private static com.applovin.exoplayer2.g.f.c a(y yVar, int i10) throws ai {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = f5582b.splitToList(yVar.f(i10));
        for (int i11 = 0; i11 < listSplitToList.size(); i11++) {
            List<String> listSplitToList2 = f5581a.splitToList(listSplitToList.get(i11));
            if (listSplitToList2.size() != 3) {
                throw ai.b(null, null);
            }
            try {
                arrayList.add(new com.applovin.exoplayer2.g.f.c.a(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ai.b(null, e10);
            }
        }
        return new com.applovin.exoplayer2.g.f.c(arrayList);
    }

    private void a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        y yVar = new y(8);
        iVar.b(yVar.d(), 0, 8);
        this.f5585e = yVar.r() + 8;
        if (yVar.q() != 1397048916) {
            uVar.f6134a = 0L;
        } else {
            uVar.f6134a = iVar.c() - ((long) (this.f5585e - 12));
            this.f5584d = 2;
        }
    }

    private void a(com.applovin.exoplayer2.e.i iVar, List<com.applovin.exoplayer2.g.a.InterfaceC0092a> list) throws IOException {
        long jC = iVar.c();
        int iD = (int) ((iVar.d() - iVar.c()) - ((long) this.f5585e));
        y yVar = new y(iD);
        iVar.b(yVar.d(), 0, iD);
        for (int i10 = 0; i10 < this.f5583c.size(); i10++) {
            a aVar = this.f5583c.get(i10);
            yVar.d((int) (aVar.f5587b - jC));
            yVar.e(4);
            int iR = yVar.r();
            int iA = a(yVar.f(iR));
            int i11 = aVar.f5588c - (iR + 8);
            if (iA == 2192) {
                list.add(a(yVar, i11));
            } else if (iA != 2816 && iA != 2817 && iA != 2819 && iA != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private void b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long j10;
        long jD = iVar.d();
        int i10 = (this.f5585e - 12) - 8;
        y yVar = new y(i10);
        iVar.b(yVar.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            yVar.e(2);
            short sL = yVar.l();
            if (sL == 2192 || sL == 2816 || sL == 2817 || sL == 2819 || sL == 2820) {
                this.f5583c.add(new a(sL, (jD - ((long) this.f5585e)) - ((long) yVar.r()), yVar.r()));
            } else {
                yVar.e(8);
            }
        }
        if (this.f5583c.isEmpty()) {
            j10 = 0;
        } else {
            this.f5584d = 3;
            j10 = this.f5583c.get(0).f5587b;
        }
        uVar.f6134a = j10;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, u uVar, List<com.applovin.exoplayer2.g.a.InterfaceC0092a> list) throws IOException {
        int i10 = this.f5584d;
        long j10 = 0;
        if (i10 == 0) {
            long jD = iVar.d();
            if (jD != -1 && jD >= 8) {
                j10 = jD - 8;
            }
            uVar.f6134a = j10;
            this.f5584d = 1;
        } else if (i10 == 1) {
            a(iVar, uVar);
        } else if (i10 == 2) {
            b(iVar, uVar);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            a(iVar, list);
            uVar.f6134a = 0L;
        }
        return 1;
    }

    public void a() {
        this.f5583c.clear();
        this.f5584d = 0;
    }
}
