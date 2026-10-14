package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0829Dw {
    public static byte[] A0F;
    public static String[] A0G = {"68X6mTnOwXdfZzYVO84LiBNlITu89iQX", "mcCM", "SB1U", "GkXNtRrGsWIfNkCQn88aLdXmD8Z6vhvm", "Qey5CsRmzWj382X", "n9", "Qz1jsOzCfP5BXHleCyslZPCOD1Jlt2Hf", "OEfF4KTHhKUz1ci9ksApPyeCZN0rEDYT"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C0811Dc A09;
    public final E1 A0A;
    public final ArrayList<RunnableC0826Dt> A0B;
    public final ArrayList<RunnableC0826Dt> A0C;
    public final CopyOnWriteArraySet<InterfaceC0822Dp> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{6, 69, 74, 71, 85, 78, 67, 85, 6, 81, 79, 82, 78, 6, 62, 36, 64, 117, 33, 109, 100, 96, 114, 117, 33, 110, 111, 100, 33, 69, 100, 114, 100, 115, 104, 96, 109, 104, 123, 100, 115, 33, 104, 114, 33, 115, 100, 112, 116, 104, 115, 100, 101, 47, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Ascii.DEL, 122, 115, 54, Ascii.DEL, 57, 121, 42, Ascii.US, 13, 21, 94, 23, 13, 94, Ascii.US, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.SUB, 9, 60, 46, 54, 125, 46, 41, 60, 41, 56, 125, 52, 46, 125, 62, 53, 60, 51, 58, 56, 57};
    }

    static {
        A0C();
    }

    public C0829Dw(E1 e10, int i10, int i11, File file, DownloadAction.Deserializer... deserializerArr) {
        HG.A05(deserializerArr.length > 0, A05(16, 38, 36));
        this.A0A = e10;
        this.A04 = i10;
        this.A05 = i11;
        this.A09 = new C0811Dc(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper looperMyLooper = Looper.myLooper();
        this.A07 = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        HandlerThread handlerThread = new HandlerThread(A05(54, 24, 51));
        this.A08 = handlerThread;
        handlerThread.start();
        this.A06 = new Handler(handlerThread.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0826Dt A02(DownloadAction downloadAction) {
        int i10 = this.A00;
        this.A00 = i10 + 1;
        RunnableC0826Dt runnableC0826Dt = new RunnableC0826Dt(i10, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0826Dt);
        A0J(A05(78, 13, 91), runnableC0826Dt);
        return runnableC0826Dt;
    }

    private void A08() {
        this.A06.post(new RunnableC0820Dn(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC0822Dp> it = this.A0D.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0G[3].charAt(7) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "Uj";
            strArr[4] = "M47RheKcpZxFkBs";
            if (zHasNext) {
                it.next().ABL(this);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction downloadAction;
        boolean canStartTask;
        if (!this.A02 || this.A03) {
            return;
        }
        boolean skipDownloadActions = this.A01 || this.A0B.size() == this.A04;
        for (int i10 = 0; i10 < this.A0C.size(); i10++) {
            RunnableC0826Dt runnableC0826Dt = this.A0C.get(i10);
            boolean zA0E = runnableC0826Dt.A0E();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "ZZ";
            strArr[4] = "k3SOhcJE6F5rWIN";
            if (zA0E && ((canStartTask = (downloadAction = runnableC0826Dt.A04).A03) || !skipDownloadActions)) {
                boolean z10 = true;
                for (int i11 = 0; i11 < i10; i11++) {
                    RunnableC0826Dt runnableC0826Dt2 = this.A0C.get(i11);
                    if (runnableC0826Dt2.A04.A09(downloadAction)) {
                        if (!canStartTask) {
                            if (runnableC0826Dt2.A04.A03) {
                                z10 = false;
                                skipDownloadActions = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            String str = runnableC0826Dt + A05(0, 14, 3) + runnableC0826Dt2;
                            runnableC0826Dt2.A08();
                        }
                    }
                }
                if (z10) {
                    runnableC0826Dt.A0A();
                    if (!canStartTask) {
                        this.A0B.add(runnableC0826Dt);
                        skipDownloadActions = this.A0B.size() == this.A04;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i10 = 0; i10 < this.A0C.size(); i10++) {
            downloadActionArr[i10] = this.A0C.get(i10).A04;
        }
        this.A06.post(new RunnableC0821Do(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC0826Dt runnableC0826Dt) {
        A0J(A05(91, 21, 120), runnableC0826Dt);
        C0828Dv c0828DvA0K = runnableC0826Dt.A0K();
        Iterator<InterfaceC0822Dp> it = this.A0D.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            A0G[0] = "TUrgn6We5nsrVkZlQG2KUeV0nEHaGaai";
            if (zHasNext) {
                it.next().ACx(this, c0828DvA0K);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0826Dt runnableC0826Dt) {
        if (this.A03) {
            return;
        }
        boolean z10 = !runnableC0826Dt.A0L();
        if (z10) {
            this.A0B.remove(runnableC0826Dt);
        }
        A0D(runnableC0826Dt);
        if (A0G[3].charAt(7) == 'd') {
            throw new RuntimeException();
        }
        A0G[6] = "xCRZPuTuqF5VhljpIGNZbvIN3H6gjFvE";
        boolean stopped = runnableC0826Dt.A0M();
        if (stopped) {
            this.A0C.remove(runnableC0826Dt);
            A0B();
        }
        if (z10) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0826Dt runnableC0826Dt) {
        String str2 = str + A05(14, 2, 33) + runnableC0826Dt;
    }

    public final int A0O(DownloadAction downloadAction) {
        HG.A04(!this.A03);
        RunnableC0826Dt runnableC0826DtA02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (runnableC0826DtA02.A06 == 0) {
                A0D(runnableC0826DtA02);
            }
        }
        return runnableC0826DtA02.A02;
    }

    public final void A0P() {
        HG.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0822Dp interfaceC0822Dp) {
        this.A0D.add(interfaceC0822Dp);
    }

    public final boolean A0R() {
        HG.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A0C.get(i10).A0L()) {
                return false;
            }
        }
        return true;
    }

    public final C0828Dv[] A0S() {
        HG.A04(!this.A03);
        C0828Dv[] c0828DvArr = new C0828Dv[this.A0C.size()];
        for (int i10 = 0; i10 < c0828DvArr.length; i10++) {
            c0828DvArr[i10] = this.A0C.get(i10).A0K();
        }
        return c0828DvArr;
    }
}
