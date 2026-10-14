package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Cj {
    public static String[] A0D = {"l0mEWa9ddmOWtLNaP3Ecwy6mLHD8UZzg", "VNe96EWaki8yaza3W8GwHPPKa5bxe5tO", "kmpa3GxYxfo0cf1rhuvwNk5Qrb09HabI", "3sCg2iJ29nRFYuhJ2lcUotI7GRJn6pCh", "XWLZFeRzwTnh2BC9TcYHYW69tvufAeZE", "SYdDROIE4gUmdNh4g7xzRZbmvYLgdVRD", "81JQxwgiV49o5YJunDWqlnSFkCvUozpt", "BnyGWHqAIvsDVpphtdYgIF4MDirarxKL"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0782Bk A0C;

    public Cj(InterfaceC0782Bk interfaceC0782Bk) {
        this.A0C = interfaceC0782Bk;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void A00(int i10) {
        boolean z10 = this.A0A;
        this.A0C.AEh(this.A04, z10 ? 1 : 0, (int) (this.A01 - this.A03), i10, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j10, int i10) {
        if (this.A0B && this.A06) {
            this.A0A = this.A08;
            this.A0B = false;
        } else {
            if (!this.A05 && !this.A06) {
                return;
            }
            if (this.A09) {
                A00(i10 + ((int) (j10 - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A09 = true;
            this.A0A = this.A08;
        }
    }

    public final void A03(long j10, int i10, int i11, long j11) {
        this.A06 = false;
        this.A05 = false;
        this.A02 = j11;
        this.A00 = 0;
        this.A01 = j10;
        if (i11 >= 32) {
            if (!this.A0B) {
                boolean z10 = this.A09;
                if (A0D[0].charAt(27) == 'I') {
                    throw new RuntimeException();
                }
                A0D[0] = "GPqbNVd0KmzIn8HN4fJcjlRtDRWTnntY";
                if (z10) {
                    A00(i10);
                    this.A09 = false;
                }
            }
            if (i11 <= 34) {
                boolean z11 = this.A0B;
                if (A0D[0].charAt(27) == 'I') {
                    throw new RuntimeException();
                }
                A0D[0] = "R2DrglDmm00IZ4lcqpbVOyN2qQAQtCsT";
                this.A05 = !z11;
                this.A0B = true;
            }
        }
        boolean z12 = i11 >= 16 && i11 <= 21;
        this.A08 = z12;
        this.A07 = z12 || i11 <= 9;
    }

    public final void A04(byte[] bArr, int i10, int i11) {
        if (this.A07) {
            int i12 = this.A00;
            int i13 = (i10 + 2) - i12;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "cpcrPWEOO8MA3KXYn8qEkHLDMe8DBK4E";
            strArr2[5] = "pATXmdvV1oW6zIeHBCJgs6zY3L0W3Kgl";
            if (i13 < i11) {
                int headerOffset = bArr[i13];
                this.A06 = (headerOffset & 128) != 0;
                String[] strArr3 = A0D;
                String str = strArr3[7];
                String str2 = strArr3[6];
                int iCharAt = str.charAt(30);
                int headerOffset2 = str2.charAt(30);
                if (iCharAt != headerOffset2) {
                    A0D[2] = "v11A3OgFTS0Ad6G9jNFN3q5DAJDiI5ZW";
                    this.A07 = false;
                    return;
                } else {
                    String[] strArr4 = A0D;
                    strArr4[7] = "OBH0KjA8v9aSSxK5wO8V3n95O2rRmiSd";
                    strArr4[6] = "STELshWQ5K1o99AkGFf5hhAcCQunI3bN";
                    this.A07 = false;
                    return;
                }
            }
            this.A00 = i12 + (i11 - i10);
        }
    }
}
