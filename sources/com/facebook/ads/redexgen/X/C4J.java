package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4J {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4I A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A00(List<C06003v> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A05(List<C06003v> list) {
        while (true) {
            int iA00 = A00(list);
            if (iA00 == -1) {
                return;
            } else {
                A01(list, iA00, iA00 + 1);
            }
        }
    }

    public C4J(C4I c4i) {
        this.A00 = c4i;
    }

    private void A01(List<C06003v> list, int i10, int i11) {
        C06003v c06003v = list.get(i10);
        C06003v c06003v2 = list.get(i11);
        switch (c06003v2.A00) {
            case 1:
                A02(list, i10, c06003v, i11, c06003v2);
                break;
            case 2:
                A03(list, i10, c06003v, i11, c06003v2);
                break;
            case 4:
                A04(list, i10, c06003v, i11, c06003v2);
                break;
        }
    }

    private void A02(List<C06003v> list, int i10, C06003v c06003v, int i11, C06003v c06003v2) {
        int i12 = 0;
        int i13 = c06003v.A01;
        int offset = c06003v2.A02;
        if (i13 < offset) {
            i12 = 0 - 1;
        }
        int i14 = c06003v.A02;
        int offset2 = c06003v2.A02;
        if (i14 < offset2) {
            i12++;
        }
        int i15 = c06003v2.A02;
        int offset3 = c06003v.A02;
        if (i15 <= offset3) {
            int i16 = c06003v.A02;
            int offset4 = c06003v2.A01;
            c06003v.A02 = i16 + offset4;
        }
        int i17 = c06003v2.A02;
        int offset5 = c06003v.A01;
        if (i17 <= offset5) {
            int i18 = c06003v.A01;
            int offset6 = c06003v2.A01;
            c06003v.A01 = i18 + offset6;
        }
        int offset7 = c06003v2.A02;
        c06003v2.A02 = offset7 + i12;
        list.set(i10, c06003v2);
        list.set(i11, c06003v);
    }

    private final void A03(List<C06003v> list, int i10, C06003v c06003v, int i11, C06003v c06003v2) {
        boolean z10;
        C06003v c06003vAA7 = null;
        boolean z11 = false;
        if (c06003v.A02 < c06003v.A01) {
            z10 = false;
            if (c06003v2.A02 == c06003v.A02 && c06003v2.A01 == c06003v.A01 - c06003v.A02) {
                z11 = true;
            }
        } else {
            z10 = true;
            if (c06003v2.A02 == c06003v.A01 + 1) {
                int remaining = c06003v2.A01;
                if (remaining == c06003v.A02 - c06003v.A01) {
                    z11 = true;
                }
            }
        }
        if (c06003v.A01 < c06003v2.A02) {
            c06003v2.A02--;
        } else {
            int remaining2 = c06003v.A01;
            if (remaining2 < c06003v2.A02 + c06003v2.A01) {
                c06003v2.A01--;
                c06003v.A00 = 2;
                c06003v.A01 = 1;
                int remaining3 = c06003v2.A01;
                if (A01[6].length() == 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
                strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
                if (remaining3 == 0) {
                    list.remove(i11);
                    this.A00.AE8(c06003v2);
                    return;
                }
                return;
            }
        }
        if (c06003v.A02 <= c06003v2.A02) {
            c06003v2.A02++;
        } else if (c06003v.A02 < c06003v2.A02 + c06003v2.A01) {
            int remaining4 = (c06003v2.A02 + c06003v2.A01) - c06003v.A02;
            c06003vAA7 = this.A00.AA7(2, c06003v.A02 + 1, remaining4, null);
            c06003v2.A01 = c06003v.A02 - c06003v2.A02;
        }
        if (z11) {
            list.set(i10, c06003v2);
            list.remove(i11);
            this.A00.AE8(c06003v);
            return;
        }
        if (z10) {
            if (c06003vAA7 != null) {
                if (c06003v.A02 > c06003vAA7.A02) {
                    c06003v.A02 -= c06003vAA7.A01;
                }
                if (c06003v.A01 > c06003vAA7.A02) {
                    c06003v.A01 -= c06003vAA7.A01;
                }
            }
            if (c06003v.A02 > c06003v2.A02) {
                c06003v.A02 -= c06003v2.A01;
            }
            if (c06003v.A01 > c06003v2.A02) {
                c06003v.A01 -= c06003v2.A01;
            }
        } else {
            if (c06003vAA7 != null) {
                if (c06003v.A02 >= c06003vAA7.A02) {
                    c06003v.A02 -= c06003vAA7.A01;
                }
                if (c06003v.A01 >= c06003vAA7.A02) {
                    c06003v.A01 -= c06003vAA7.A01;
                }
            }
            if (c06003v.A02 >= c06003v2.A02) {
                c06003v.A02 -= c06003v2.A01;
            }
            if (c06003v.A01 >= c06003v2.A02) {
                c06003v.A01 -= c06003v2.A01;
            }
        }
        list.set(i10, c06003v2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c06003v.A02 != c06003v.A01) {
            list.set(i11, c06003v);
        } else {
            list.remove(i11);
        }
        if (c06003vAA7 != null) {
            list.add(i10, c06003vAA7);
        }
    }

    private final void A04(List<C06003v> list, int i10, C06003v c06003v, int i11, C06003v c06003v2) {
        C06003v c06003vAA7 = null;
        C06003v c06003vAA8 = null;
        if (c06003v.A01 < c06003v2.A02) {
            c06003v2.A02--;
        } else {
            int remaining = c06003v.A01;
            if (remaining < c06003v2.A02 + c06003v2.A01) {
                c06003v2.A01--;
                c06003vAA7 = this.A00.AA7(4, c06003v.A02, 1, c06003v2.A03);
            }
        }
        if (c06003v.A02 <= c06003v2.A02) {
            c06003v2.A02++;
        } else if (c06003v.A02 < c06003v2.A02 + c06003v2.A01) {
            int i12 = (c06003v2.A02 + c06003v2.A01) - c06003v.A02;
            c06003vAA8 = this.A00.AA7(4, c06003v.A02 + 1, i12, c06003v2.A03);
            c06003v2.A01 -= i12;
        }
        list.set(i11, c06003v);
        if (c06003v2.A01 > 0) {
            list.set(i10, c06003v2);
        } else {
            list.remove(i10);
            this.A00.AE8(c06003v2);
        }
        if (c06003vAA7 != null) {
            list.add(i10, c06003vAA7);
        }
        if (c06003vAA8 != null) {
            list.add(i10, c06003vAA8);
        }
    }
}
