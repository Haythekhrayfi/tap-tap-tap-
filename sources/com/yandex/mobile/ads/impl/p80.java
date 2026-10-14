package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class p80 implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<sc> f24006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24007b;

    private p80(int i10, com.yandex.mobile.ads.embedded.guava.collect.p<sc> pVar) {
        this.f24007b = i10;
        this.f24006a = pVar;
    }

    public static p80 a(int i10, mp0 mp0Var) {
        int iO;
        String str;
        String str2;
        String str3;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        int iE = mp0Var.e();
        int i11 = -2;
        while (mp0Var.a() > 8) {
            int iK = mp0Var.k();
            int iD = mp0Var.d() + mp0Var.k();
            mp0Var.d(iD);
            sc q41Var = null;
            if (iK == 1414744396) {
                q41Var = a(mp0Var.k(), mp0Var);
            } else if (iK != 1718776947) {
                if (iK == 1751742049) {
                    q41Var = uc.a(mp0Var);
                } else if (iK == 1752331379) {
                    q41Var = vc.a(mp0Var);
                } else if (iK == 1852994675) {
                    q41Var = r41.a(mp0Var);
                }
            } else if (i11 == 2) {
                mp0Var.f(4);
                int iK2 = mp0Var.k();
                int iK3 = mp0Var.k();
                mp0Var.f(4);
                iO = mp0Var.k();
                switch (iO) {
                    case 808802372:
                    case 877677894:
                    case 1145656883:
                    case 1145656920:
                    case 1482049860:
                    case 1684633208:
                    case 2021026148:
                        str3 = "video/mp4v-es";
                        break;
                    case 826496577:
                    case 828601953:
                    case 875967048:
                        str3 = "video/avc";
                        break;
                    case 842289229:
                        str3 = "video/mp42";
                        break;
                    case 859066445:
                        str3 = "video/mp43";
                        break;
                    case 1196444237:
                    case 1735420525:
                        str3 = "video/mjpeg";
                        break;
                    default:
                        str3 = null;
                        break;
                }
                if (str3 == null) {
                    str2 = "Ignoring track with unsupported compression ";
                    o80.a(str2, iO, "StreamFormatChunk");
                } else {
                    yv.a aVar2 = new yv.a();
                    aVar2.q(iK2).g(iK3).f(str3);
                    q41Var = new q41(aVar2.a());
                }
            } else if (i11 == 1) {
                iO = mp0Var.o();
                if (iO == 1) {
                    str = "audio/raw";
                } else if (iO == 85) {
                    str = "audio/mpeg";
                } else if (iO == 255) {
                    str = "audio/mp4a-latm";
                } else if (iO != 8192) {
                    str = iO != 8193 ? null : "audio/vnd.dts";
                } else {
                    str = "audio/ac3";
                }
                if (str == null) {
                    str2 = "Ignoring track with unsupported format tag ";
                    o80.a(str2, iO, "StreamFormatChunk");
                } else {
                    int iO2 = mp0Var.o();
                    int iK4 = mp0Var.k();
                    mp0Var.f(6);
                    int iB = da1.b(mp0Var.z());
                    int iO3 = mp0Var.o();
                    byte[] bArr = new byte[iO3];
                    mp0Var.a(bArr, 0, iO3);
                    yv.a aVar3 = new yv.a();
                    aVar3.f(str).c(iO2).n(iK4);
                    if ("audio/raw".equals(str) && iB != 0) {
                        aVar3.j(iB);
                    }
                    if ("audio/mp4a-latm".equals(str) && iO3 > 0) {
                        aVar3.a(com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr));
                    }
                    q41Var = new q41(aVar3.a());
                }
            } else {
                StringBuilder sbA = v60.a("Ignoring strf box for unsupported track type: ");
                sbA.append(da1.d(i11));
                p90.d("StreamFormatChunk", sbA.toString());
            }
            if (q41Var != null) {
                if (q41Var.getType() == 1752331379) {
                    vc vcVar = (vc) q41Var;
                    int i12 = vcVar.f25954a;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        StringBuilder sbA2 = v60.a("Found unsupported streamType fourCC: ");
                        sbA2.append(Integer.toHexString(vcVar.f25954a));
                        p90.d("AviStreamHeaderChunk", sbA2.toString());
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                aVar.b(q41Var);
            }
            mp0Var.e(iD);
            mp0Var.d(iE);
        }
        return new p80(i10, aVar.a());
    }

    @Override // com.yandex.mobile.ads.impl.sc
    public final int getType() {
        return this.f24007b;
    }
}
