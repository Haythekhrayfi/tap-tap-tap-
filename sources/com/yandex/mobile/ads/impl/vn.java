package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class vn implements kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f26030a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f26031b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ma1 f26032c = new ma1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private jr f26033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26036g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f26038b;

        private a(int i10, long j10) {
            this.f26037a = i10;
            this.f26038b = j10;
        }

        public /* synthetic */ a(int i10, long j10, int i11) {
            this(i10, j10);
        }
    }

    public final void a() {
        this.f26034e = 0;
        this.f26031b.clear();
        this.f26032c.b();
    }

    public final void a(jr jrVar) {
        this.f26033d = jrVar;
    }

    public final boolean a(xn xnVar) throws IOException {
        int i10;
        String str;
        pa.b(this.f26033d);
        while (true) {
            a aVarPeek = this.f26031b.peek();
            if (aVarPeek != null && xnVar.getPosition() >= aVarPeek.f26038b) {
                ma0.this.b(this.f26031b.pop().f26037a);
                return true;
            }
            int i11 = 0;
            if (this.f26034e == 0) {
                long jA = this.f26032c.a(xnVar, true, false, 4);
                if (jA == -2) {
                    xnVar.c();
                    while (true) {
                        xnVar.b(this.f26030a, 0, 4, false);
                        int iA = ma1.a(this.f26030a[0]);
                        if (iA != -1 && iA <= 4) {
                            int iA2 = (int) ma1.a(this.f26030a, iA, false);
                            if (((ma0.a) this.f26033d).a(iA2)) {
                                xnVar.a(iA);
                                jA = iA2;
                            }
                        }
                        xnVar.a(1);
                    }
                }
                if (jA == -1) {
                    return false;
                }
                this.f26035f = (int) jA;
                this.f26034e = 1;
            }
            if (this.f26034e == 1) {
                this.f26036g = this.f26032c.a(xnVar, false, true, 8);
                this.f26034e = 2;
            }
            jr jrVar = this.f26033d;
            int i12 = this.f26035f;
            Objects.requireNonNull(ma0.this);
            switch (i12) {
                case 131:
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                case 155:
                case 159:
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i10 = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i10 = 3;
                    break;
                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i10 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i10 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i10 = 5;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    long position = xnVar.getPosition();
                    this.f26031b.push(new a(this.f26035f, this.f26036g + position, i11));
                    ma0.this.a(this.f26035f, position, this.f26036g);
                    this.f26034e = 0;
                    return true;
                }
                long j10 = 0;
                if (i10 == 2) {
                    long j11 = this.f26036g;
                    if (j11 > 8) {
                        StringBuilder sbA = v60.a("Invalid integer size: ");
                        sbA.append(this.f26036g);
                        throw qp0.a(sbA.toString(), (Exception) null);
                    }
                    jr jrVar2 = this.f26033d;
                    int i13 = this.f26035f;
                    int i14 = (int) j11;
                    xnVar.a(this.f26030a, 0, i14, false);
                    for (int i15 = 0; i15 < i14; i15++) {
                        j10 = ((long) (this.f26030a[i15] & 255)) | (j10 << 8);
                    }
                    ma0.this.a(i13, j10);
                    this.f26034e = 0;
                    return true;
                }
                if (i10 == 3) {
                    long j12 = this.f26036g;
                    if (j12 > 2147483647L) {
                        StringBuilder sbA2 = v60.a("String element size: ");
                        sbA2.append(this.f26036g);
                        throw qp0.a(sbA2.toString(), (Exception) null);
                    }
                    jr jrVar3 = this.f26033d;
                    int i16 = this.f26035f;
                    int i17 = (int) j12;
                    if (i17 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i17];
                        xnVar.a(bArr, 0, i17, false);
                        while (i17 > 0 && bArr[i17 - 1] == 0) {
                            i17--;
                        }
                        str = new String(bArr, 0, i17);
                    }
                    ma0.this.a(i16, str);
                    this.f26034e = 0;
                    return true;
                }
                if (i10 == 4) {
                    ma0.this.a(this.f26035f, (int) this.f26036g, xnVar);
                    this.f26034e = 0;
                    return true;
                }
                if (i10 != 5) {
                    throw qp0.a("Invalid element type " + i10, (Exception) null);
                }
                long j13 = this.f26036g;
                if (j13 != 4 && j13 != 8) {
                    StringBuilder sbA3 = v60.a("Invalid float size: ");
                    sbA3.append(this.f26036g);
                    throw qp0.a(sbA3.toString(), (Exception) null);
                }
                jr jrVar4 = this.f26033d;
                int i18 = this.f26035f;
                int i19 = (int) j13;
                xnVar.a(this.f26030a, 0, i19, false);
                for (int i20 = 0; i20 < i19; i20++) {
                    j10 = (j10 << 8) | ((long) (this.f26030a[i20] & 255));
                }
                ma0.this.a(i18, i19 == 4 ? Float.intBitsToFloat((int) j10) : Double.longBitsToDouble(j10));
                this.f26034e = 0;
                return true;
            }
            xnVar.a((int) this.f26036g);
            this.f26034e = 0;
        }
    }
}
