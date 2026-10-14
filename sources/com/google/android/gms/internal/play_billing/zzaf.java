package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzaf extends zzx {
    public static final zzx zza = new zzaf(null, new Object[0], 0);
    public final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzaf(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static zzaf zzf(int i10, Object[] objArr, zzw zzwVar) {
        short[] sArr;
        ?? r10;
        ?? r11;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzaf) zza;
        }
        zzv zzvVar = null;
        ?? r12 = 0;
        zzv zzvVar2 = null;
        zzv zzvVar3 = null;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzp.zza(obj, obj2);
            return new zzaf(null, objArrCopyOf, 1);
        }
        zzm.zzb(i11, objArrCopyOf.length >> 1, "index");
        char c10 = 2;
        int iMax = Math.max(i11, 2);
        int i12 = 1073741824;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            i12 = iHighestOneBit + iHighestOneBit;
            while (((double) i12) * 0.7d < iMax) {
                i12 += i12;
            }
        } else if (iMax >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i11 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzp.zza(obj3, obj4);
        } else {
            int i13 = i12 - 1;
            byte b10 = -1;
            if (i12 <= 128) {
                byte[] bArr = new byte[i12];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    int i16 = i14 + i14;
                    int i17 = i15 + i15;
                    Object obj5 = objArrCopyOf[i17];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i17 ^ 1];
                    Objects.requireNonNull(obj6);
                    zzp.zza(obj5, obj6);
                    int iZza = zzq.zza(obj5.hashCode());
                    while (true) {
                        int i18 = iZza & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i14 < i15) {
                                objArrCopyOf[i16] = obj5;
                                objArrCopyOf[i16 ^ 1] = obj6;
                            }
                            i14++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj7 = objArrCopyOf[i20 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzv zzvVar4 = new zzv(obj5, obj6, obj7);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj6;
                            zzvVar2 = zzvVar4;
                            break;
                        }
                        iZza = i18 + 1;
                    }
                }
                if (i14 == i11) {
                    r10 = bArr;
                    c10 = 2;
                    r12 = r10;
                } else {
                    r12 = new Object[]{bArr, Integer.valueOf(i14), zzvVar2};
                    c10 = 2;
                }
            } else if (i12 <= 32768) {
                sArr = new short[i12];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i11; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj8 = objArrCopyOf[i24];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArrCopyOf[i24 ^ 1];
                    Objects.requireNonNull(obj9);
                    zzp.zza(obj8, obj9);
                    int iZza2 = zzq.zza(obj8.hashCode());
                    while (true) {
                        int i25 = iZza2 & i13;
                        char c11 = (char) sArr[i25];
                        if (c11 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArrCopyOf[i23] = obj8;
                                objArrCopyOf[i23 ^ 1] = obj9;
                            }
                            i21++;
                            break;
                        }
                        if (obj8.equals(objArrCopyOf[c11])) {
                            int i26 = c11 ^ 1;
                            Object obj10 = objArrCopyOf[i26 == true ? 1 : 0];
                            Objects.requireNonNull(obj10);
                            zzv zzvVar5 = new zzv(obj8, obj9, obj10);
                            objArrCopyOf[i26 == true ? 1 : 0] = obj9;
                            zzvVar3 = zzvVar5;
                            break;
                        }
                        iZza2 = i25 + 1;
                    }
                }
                if (i21 != i11) {
                    c10 = 2;
                    r11 = new Object[]{sArr, Integer.valueOf(i21), zzvVar3};
                    r12 = r11;
                }
                r10 = sArr;
                c10 = 2;
                r12 = r10;
            } else {
                sArr = new int[i12];
                Arrays.fill((int[]) sArr, -1);
                int i27 = 0;
                int i28 = 0;
                while (i27 < i11) {
                    int i29 = i28 + i28;
                    int i30 = i27 + i27;
                    Object obj11 = objArrCopyOf[i30];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArrCopyOf[i30 ^ 1];
                    Objects.requireNonNull(obj12);
                    zzp.zza(obj11, obj12);
                    int iZza3 = zzq.zza(obj11.hashCode());
                    while (true) {
                        int i31 = iZza3 & i13;
                        ?? r15 = sArr[i31];
                        if (r15 == b10) {
                            sArr[i31] = i29;
                            if (i28 < i27) {
                                objArrCopyOf[i29] = obj11;
                                objArrCopyOf[i29 ^ 1] = obj12;
                            }
                            i28++;
                            break;
                        }
                        if (obj11.equals(objArrCopyOf[r15])) {
                            int i32 = r15 ^ 1;
                            Object obj13 = objArrCopyOf[i32 == true ? 1 : 0];
                            Objects.requireNonNull(obj13);
                            zzv zzvVar6 = new zzv(obj11, obj12, obj13);
                            objArrCopyOf[i32 == true ? 1 : 0] = obj12;
                            zzvVar = zzvVar6;
                            break;
                        }
                        iZza3 = i31 + 1;
                        b10 = -1;
                    }
                    i27++;
                    b10 = -1;
                }
                if (i28 != i11) {
                    c10 = 2;
                    r11 = new Object[]{sArr, Integer.valueOf(i28), zzvVar};
                    r12 = r11;
                }
                r10 = sArr;
                c10 = 2;
                r12 = r10;
            }
        }
        boolean z10 = r12 instanceof Object[];
        ?? r13 = r12;
        if (z10) {
            Object[] objArr2 = (Object[]) r12;
            zzwVar.zzc = (zzv) objArr2[c10];
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r13 = obj14;
            i11 = iIntValue;
        }
        return new zzaf(r13, objArrCopyOf, i11);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.zzx, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i10 = this.zzd;
        if (obj == null) {
            obj2 = null;
        } else if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iZza = zzq.zza(obj.hashCode());
            while (true) {
                int i11 = iZza & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    break;
                }
                if (obj.equals(objArr[i12])) {
                    obj2 = objArr[i12 ^ 1];
                } else {
                    iZza = i11 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iZza2 = zzq.zza(obj.hashCode());
            while (true) {
                int i13 = iZza2 & length2;
                char c10 = (char) sArr[i13];
                if (c10 == 65535) {
                    break;
                }
                if (obj.equals(objArr[c10])) {
                    obj2 = objArr[c10 ^ 1];
                } else {
                    iZza2 = i13 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iZza3 = zzq.zza(obj.hashCode());
            while (true) {
                int i14 = iZza3 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    break;
                }
                if (obj.equals(objArr[i15])) {
                    obj2 = objArr[i15 ^ 1];
                } else {
                    iZza3 = i14 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzr zza() {
        return new zzae(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzy zzc() {
        return new zzac(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzy zzd() {
        return new zzad(this, new zzae(this.zzb, 0, this.zzd));
    }
}
