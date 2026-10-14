package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0925Hq {
    public static String[] A07 = {"5DRquCQGg5fv0P6nja7IsOodPXBGhUeG", "CLJKgVN4XJask5diLy7MGSBxba0Pch5a", "wHftqcE0jDwIdOqBDBC3mNx0B5SBQznZ", "ol9v552kFRhJ1T6A32CtEuz", "A1CuUzQu9jwyUqSqJ17msfwDUTn6GREa", "TbNgrGyLzvQfDvkF0WCoqwQu2K", "lR0XC8VxWttqZJTwOmQs4gh4fjIE6f", "2mBuumTUpjmiSXNoBcdi8fBRoWPOanRf"};
    public static final Comparator<C0924Hp> A08 = new C0922Hn();
    public static final Comparator<C0924Hp> A09 = new C0923Ho();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0924Hp[] A06 = new C0924Hp[5];
    public final ArrayList<C0924Hp> A05 = new ArrayList<>();
    public int A00 = -1;

    public C0925Hq(int i10) {
        this.A04 = i10;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f10) {
        A01();
        float f11 = this.A03 * f10;
        int i10 = 0;
        for (int i11 = 0; i11 < this.A05.size(); i11++) {
            C0924Hp c0924Hp = this.A05.get(i11);
            i10 += c0924Hp.A02;
            float desiredWeight = i10;
            if (desiredWeight >= f11) {
                float desiredWeight2 = c0924Hp.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C0924Hp> arrayList = this.A05;
        int size = arrayList.size();
        int accumulatedWeight = A07[3].length();
        if (accumulatedWeight == 12) {
            throw new RuntimeException();
        }
        A07[3] = "XkLaJBoD11zWycQ";
        float desiredWeight3 = arrayList.get(size - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i10, float f10) {
        C0924Hp oldestSample;
        A00();
        int i11 = this.A02;
        if (i11 > 0) {
            C0924Hp[] c0924HpArr = this.A06;
            int i12 = i11 - 1;
            this.A02 = i12;
            oldestSample = c0924HpArr[i12];
        } else {
            oldestSample = new C0924Hp(null);
        }
        int i13 = this.A01;
        this.A01 = i13 + 1;
        oldestSample.A01 = i13;
        oldestSample.A02 = i10;
        oldestSample.A00 = f10;
        this.A05.add(oldestSample);
        this.A03 += i10;
        while (true) {
            int i14 = this.A03;
            int i15 = this.A04;
            if (i14 > i15) {
                int excessWeight = i14 - i15;
                C0924Hp c0924Hp = this.A05.get(0);
                if (c0924Hp.A02 <= excessWeight) {
                    int i16 = this.A03;
                    int i17 = c0924Hp.A02;
                    if (A07[5].length() != 26) {
                        throw new RuntimeException();
                    }
                    A07[6] = "uvvU8EqEwFGMOcNu2z1EziqDegtCkn";
                    this.A03 = i16 - i17;
                    this.A05.remove(0);
                    int i18 = this.A02;
                    if (i18 < 5) {
                        C0924Hp[] c0924HpArr2 = this.A06;
                        this.A02 = i18 + 1;
                        c0924HpArr2[i18] = c0924Hp;
                    }
                } else {
                    c0924Hp.A02 -= excessWeight;
                    this.A03 -= excessWeight;
                }
            } else {
                return;
            }
        }
    }
}
