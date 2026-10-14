package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagt implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzagp
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzagt.zza;
            return new zzaaw[]{new zzagt(0, null)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzaaz zzD;
    private zzabz[] zzE;
    private zzabz[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzfa zzf;
    private final zzfa zzg;
    private final zzfa zzh;
    private final byte[] zzi;
    private final zzfa zzj;
    private final zzadq zzk;
    private final zzfa zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzfa zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzags zzy;
    private int zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzS("application/x-emsg");
        zzc = zzakVar.zzY();
    }

    public zzagt() {
        this(0, null);
    }

    public zzagt(int i10, zzfh zzfhVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzadq();
        this.zzl = new zzfa(16);
        this.zzf = new zzfa(zzfu.zza);
        this.zzg = new zzfa(5);
        this.zzh = new zzfa();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzfa(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzaaz.zza;
        this.zzE = new zzabz[0];
        this.zzF = new zzabz[0];
    }

    private static int zze(int i10) throws zzcd {
        if (i10 >= 0) {
            return i10;
        }
        throw zzcd.zza("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    private static zzad zzf(List list) {
        zzagz zzagzVar;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            zzagd zzagdVar = (zzagd) list.get(i10);
            if (zzagdVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzH = zzagdVar.zza.zzH();
                zzfa zzfaVar = new zzfa(bArrZzH);
                if (zzfaVar.zzd() < 32) {
                    zzagzVar = null;
                } else {
                    zzfaVar.zzF(0);
                    if (zzfaVar.zze() == zzfaVar.zza() + 4 && zzfaVar.zze() == 1886614376) {
                        int iZze = zzage.zze(zzfaVar.zze());
                        if (iZze > 1) {
                            zzer.zzf("PsshAtomUtil", "Unsupported pssh version: " + iZze);
                        } else {
                            UUID uuid = new UUID(zzfaVar.zzr(), zzfaVar.zzr());
                            if (iZze == 1) {
                                zzfaVar.zzG(zzfaVar.zzn() * 16);
                            }
                            int iZzn = zzfaVar.zzn();
                            if (iZzn == zzfaVar.zza()) {
                                byte[] bArr = new byte[iZzn];
                                zzfaVar.zzB(bArr, 0, iZzn);
                                zzagzVar = new zzagz(uuid, iZze, bArr);
                            }
                        }
                        zzagzVar = null;
                    } else {
                        zzagzVar = null;
                    }
                }
                UUID uuid2 = zzagzVar == null ? null : zzagzVar.zza;
                if (uuid2 == null) {
                    zzer.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzac(uuid2, null, "video/mp4", bArrZzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzad(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfa zzfaVar, int i10, zzahe zzaheVar) throws zzcd {
        zzfaVar.zzF(i10 + 8);
        int iZze = zzfaVar.zze() & 16777215;
        if ((iZze & 1) != 0) {
            throw zzcd.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iZze & 2) != 0;
        int iZzn = zzfaVar.zzn();
        if (iZzn == 0) {
            Arrays.fill(zzaheVar.zzl, 0, zzaheVar.zze, false);
            return;
        }
        int i11 = zzaheVar.zze;
        if (iZzn != i11) {
            throw zzcd.zza("Senc sample count " + iZzn + " is different from fragment sample count" + i11, null);
        }
        Arrays.fill(zzaheVar.zzl, 0, iZzn, z10);
        zzaheVar.zza(zzfaVar.zza());
        zzfa zzfaVar2 = zzaheVar.zzn;
        zzfaVar.zzB(zzfaVar2.zzH(), 0, zzfaVar2.zzd());
        zzaheVar.zzn.zzF(0);
        zzaheVar.zzo = false;
    }

    /* JADX WARN: Code duplicated, block: B:254:0x0635  */
    private final void zzi(long j10) throws zzcd {
        zzagt zzagtVar;
        SparseArray sparseArray;
        zzagc zzagcVar;
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        byte[] bArr2;
        byte[] bArr3;
        int i14;
        boolean z10;
        zzahe zzaheVar;
        zzagc zzagcVar2;
        zzags zzagsVar;
        int i15;
        boolean z11;
        int i16;
        int iZze;
        long[] jArr;
        final zzagt zzagtVar2 = this;
        while (!zzagtVar2.zzm.isEmpty() && ((zzagc) zzagtVar2.zzm.peek()).zza == j10) {
            zzagc zzagcVar3 = (zzagc) zzagtVar2.zzm.pop();
            int i17 = zzagcVar3.zzd;
            int i18 = 12;
            int i19 = 8;
            if (i17 == 1836019574) {
                zzad zzadVarZzf = zzf(zzagcVar3.zzb);
                zzagc zzagcVarZza = zzagcVar3.zza(1836475768);
                Objects.requireNonNull(zzagcVarZza);
                SparseArray sparseArray2 = new SparseArray();
                int size = zzagcVarZza.zzb.size();
                long jZzs = -9223372036854775807L;
                int i20 = 0;
                while (i20 < size) {
                    zzagd zzagdVar = (zzagd) zzagcVarZza.zzb.get(i20);
                    int i21 = zzagdVar.zzd;
                    if (i21 == 1953654136) {
                        zzfa zzfaVar = zzagdVar.zza;
                        zzfaVar.zzF(i18);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzfaVar.zze()), new zzago(zzfaVar.zze() - 1, zzfaVar.zze(), zzfaVar.zze(), zzfaVar.zze()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzago) pairCreate.second);
                    } else if (i21 == 1835362404) {
                        zzfa zzfaVar2 = zzagdVar.zza;
                        zzfaVar2.zzF(8);
                        jZzs = zzage.zze(zzfaVar2.zze()) == 0 ? zzfaVar2.zzs() : zzfaVar2.zzt();
                    }
                    i20++;
                    i18 = 12;
                }
                List listZzc = zzagn.zzc(zzagcVar3, new zzabl(), jZzs, zzadVarZzf, false, false, new zzfov() { // from class: com.google.android.gms.internal.ads.zzagq
                    @Override // com.google.android.gms.internal.ads.zzfov
                    public final Object apply(Object obj) {
                        return (zzahc) obj;
                    }
                });
                int size2 = listZzc.size();
                if (zzagtVar2.zze.size() == 0) {
                    for (int i22 = 0; i22 < size2; i22++) {
                        zzahf zzahfVar = (zzahf) listZzc.get(i22);
                        zzahc zzahcVar = zzahfVar.zza;
                        zzagtVar2.zze.put(zzahcVar.zza, new zzags(zzagtVar2.zzD.zzv(i22, zzahcVar.zzb), zzahfVar, zzj(sparseArray2, zzahcVar.zza)));
                        zzagtVar2.zzw = Math.max(zzagtVar2.zzw, zzahcVar.zze);
                    }
                    zzagtVar2.zzD.zzC();
                } else {
                    zzdy.zzf(zzagtVar2.zze.size() == size2);
                    for (int i23 = 0; i23 < size2; i23++) {
                        zzahf zzahfVar2 = (zzahf) listZzc.get(i23);
                        zzahc zzahcVar2 = zzahfVar2.zza;
                        ((zzags) zzagtVar2.zze.get(zzahcVar2.zza)).zzh(zzahfVar2, zzj(sparseArray2, zzahcVar2.zza));
                    }
                }
            } else {
                if (i17 == 1836019558) {
                    SparseArray sparseArray3 = zzagtVar2.zze;
                    byte[] bArr4 = zzagtVar2.zzi;
                    int size3 = zzagcVar3.zzc.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        zzagc zzagcVar4 = (zzagc) zzagcVar3.zzc.get(i24);
                        if (zzagcVar4.zzd == 1953653094) {
                            zzagd zzagdVarZzb = zzagcVar4.zzb(1952868452);
                            Objects.requireNonNull(zzagdVarZzb);
                            zzfa zzfaVar3 = zzagdVarZzb.zza;
                            zzfaVar3.zzF(i19);
                            int iZze2 = zzfaVar3.zze() & 16777215;
                            zzags zzagsVar2 = (zzags) sparseArray3.get(zzfaVar3.zze());
                            if (zzagsVar2 == null) {
                                zzagsVar2 = null;
                            } else {
                                if ((iZze2 & 1) != 0) {
                                    long jZzt = zzfaVar3.zzt();
                                    zzahe zzaheVar2 = zzagsVar2.zzb;
                                    zzaheVar2.zzb = jZzt;
                                    zzaheVar2.zzc = jZzt;
                                }
                                zzago zzagoVar = zzagsVar2.zze;
                                zzagsVar2.zzb.zza = new zzago((iZze2 & 2) != 0 ? zzfaVar3.zze() - 1 : zzagoVar.zza, (iZze2 & 8) != 0 ? zzfaVar3.zze() : zzagoVar.zzb, (iZze2 & 16) != 0 ? zzfaVar3.zze() : zzagoVar.zzc, (iZze2 & 32) != 0 ? zzfaVar3.zze() : zzagoVar.zzd);
                            }
                            if (zzagsVar2 == null) {
                                sparseArray = sparseArray3;
                                zzagcVar = zzagcVar3;
                                i10 = size3;
                                i11 = i19;
                                i12 = i24;
                                bArr = bArr4;
                            } else {
                                zzahe zzaheVar3 = zzagsVar2.zzb;
                                long j11 = zzaheVar3.zzp;
                                boolean z12 = zzaheVar3.zzq;
                                zzagsVar2.zzi();
                                zzagsVar2.zzl = true;
                                zzagd zzagdVarZzb2 = zzagcVar4.zzb(1952867444);
                                if (zzagdVarZzb2 != null) {
                                    zzfa zzfaVar4 = zzagdVarZzb2.zza;
                                    zzfaVar4.zzF(i19);
                                    zzaheVar3.zzp = zzage.zze(zzfaVar4.zze()) == 1 ? zzfaVar4.zzt() : zzfaVar4.zzs();
                                    zzaheVar3.zzq = true;
                                } else {
                                    zzaheVar3.zzp = j11;
                                    zzaheVar3.zzq = z12;
                                }
                                List list = zzagcVar4.zzb;
                                int size4 = list.size();
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    i13 = 1953658222;
                                    if (i25 >= size4) {
                                        break;
                                    }
                                    zzagd zzagdVar2 = (zzagd) list.get(i25);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzagdVar2.zzd == 1953658222) {
                                        zzfa zzfaVar5 = zzagdVar2.zza;
                                        zzfaVar5.zzF(12);
                                        int iZzn = zzfaVar5.zzn();
                                        if (iZzn > 0) {
                                            i27 += iZzn;
                                            i26++;
                                        }
                                    }
                                    i25++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzagsVar2.zzh = 0;
                                zzagsVar2.zzg = 0;
                                zzagsVar2.zzf = 0;
                                zzahe zzaheVar4 = zzagsVar2.zzb;
                                zzaheVar4.zzd = i26;
                                zzaheVar4.zze = i27;
                                if (zzaheVar4.zzg.length < i26) {
                                    zzaheVar4.zzf = new long[i26];
                                    zzaheVar4.zzg = new int[i26];
                                }
                                if (zzaheVar4.zzh.length < i27) {
                                    int i28 = (i27 * 125) / 100;
                                    zzaheVar4.zzh = new int[i28];
                                    zzaheVar4.zzi = new long[i28];
                                    zzaheVar4.zzj = new boolean[i28];
                                    zzaheVar4.zzl = new boolean[i28];
                                }
                                int i29 = 0;
                                int i30 = 0;
                                int i31 = 0;
                                while (true) {
                                    long j12 = 0;
                                    if (i29 >= size4) {
                                        break;
                                    }
                                    zzagd zzagdVar3 = (zzagd) list.get(i29);
                                    if (zzagdVar3.zzd == i13) {
                                        int i32 = i30 + 1;
                                        zzfa zzfaVar6 = zzagdVar3.zza;
                                        zzfaVar6.zzF(8);
                                        int iZze3 = zzfaVar6.zze() & 16777215;
                                        zzahc zzahcVar3 = zzagsVar2.zzd.zza;
                                        zzahe zzaheVar5 = zzagsVar2.zzb;
                                        zzago zzagoVar2 = zzaheVar5.zza;
                                        int i33 = zzfj.zza;
                                        zzaheVar5.zzg[i30] = zzfaVar6.zzn();
                                        long[] jArr2 = zzaheVar5.zzf;
                                        long j13 = zzaheVar5.zzb;
                                        jArr2[i30] = j13;
                                        if ((iZze3 & 1) != 0) {
                                            jArr2[i30] = j13 + ((long) zzfaVar6.zze());
                                        }
                                        boolean z13 = (iZze3 & 4) != 0;
                                        int iZze4 = zzagoVar2.zzd;
                                        if (z13) {
                                            iZze4 = zzfaVar6.zze();
                                        }
                                        int i34 = iZze3 & 256;
                                        int i35 = iZze3 & 512;
                                        int i36 = iZze3 & 1024;
                                        int i37 = iZze3 & 2048;
                                        int i38 = iZze4;
                                        long[] jArr3 = zzahcVar3.zzh;
                                        if (jArr3 != null) {
                                            zzagcVar2 = zzagcVar4;
                                            if (jArr3.length != 1 || (jArr = zzahcVar3.zzi) == null) {
                                                z11 = z13;
                                                i15 = i37;
                                                zzagsVar = zzagsVar2;
                                            } else {
                                                long j14 = jArr3[0];
                                                if (j14 == 0) {
                                                    z11 = z13;
                                                    i15 = i37;
                                                    zzagsVar = zzagsVar2;
                                                } else {
                                                    long j15 = j14 + jArr[0];
                                                    i15 = i37;
                                                    z11 = z13;
                                                    zzagsVar = zzagsVar2;
                                                    if (zzfj.zzp(j15, 1000000L, zzahcVar3.zzd) >= zzahcVar3.zze) {
                                                    }
                                                }
                                                j12 = zzahcVar3.zzi[0];
                                            }
                                        } else {
                                            zzagcVar2 = zzagcVar4;
                                            i15 = i37;
                                            zzagsVar = zzagsVar2;
                                            z11 = z13;
                                        }
                                        int[] iArr = zzaheVar5.zzh;
                                        long[] jArr4 = zzaheVar5.zzi;
                                        boolean[] zArr = zzaheVar5.zzj;
                                        int i39 = zzaheVar5.zzg[i30] + i31;
                                        zzahe zzaheVar6 = zzaheVar3;
                                        long j16 = zzahcVar3.zzc;
                                        zzaheVar = zzaheVar6;
                                        long j17 = zzaheVar5.zzp;
                                        while (i31 < i39) {
                                            int iZze5 = i34 != 0 ? zzfaVar6.zze() : zzagoVar2.zzb;
                                            zze(iZze5);
                                            int iZze6 = i35 != 0 ? zzfaVar6.zze() : zzagoVar2.zzc;
                                            zze(iZze6);
                                            if (i36 != 0) {
                                                i16 = i39;
                                                iZze = zzfaVar6.zze();
                                            } else {
                                                i16 = i39;
                                                if (i31 != 0) {
                                                    iZze = zzagoVar2.zzd;
                                                } else if (z11) {
                                                    iZze = i38;
                                                    i31 = 0;
                                                } else {
                                                    i31 = 0;
                                                    iZze = zzagoVar2.zzd;
                                                }
                                            }
                                            long jZzp = zzfj.zzp((((long) (i15 != 0 ? zzfaVar6.zze() : 0)) + j17) - j12, 1000000L, j16);
                                            jArr4[i31] = jZzp;
                                            long j18 = j16;
                                            if (!zzaheVar5.zzq) {
                                                jArr4[i31] = jZzp + zzagsVar.zzd.zzh;
                                            }
                                            iArr[i31] = iZze6;
                                            zArr[i31] = 1 == (((iZze >> 16) & 1) ^ 1);
                                            j17 += (long) iZze5;
                                            i31++;
                                            j16 = j18;
                                            i34 = i34;
                                            i35 = i35;
                                            i39 = i16;
                                            i15 = i15;
                                            zzagoVar2 = zzagoVar2;
                                        }
                                        int i40 = i39;
                                        zzaheVar5.zzp = j17;
                                        i30 = i32;
                                        i31 = i40;
                                    } else {
                                        i29 = i29;
                                        zzaheVar = zzaheVar3;
                                        zzagcVar2 = zzagcVar4;
                                        zzagsVar = zzagsVar2;
                                    }
                                    i29++;
                                    list = list;
                                    size3 = size3;
                                    size4 = size4;
                                    zzagcVar3 = zzagcVar3;
                                    bArr4 = bArr4;
                                    i24 = i24;
                                    zzagcVar4 = zzagcVar2;
                                    zzagsVar2 = zzagsVar;
                                    zzaheVar3 = zzaheVar;
                                    i13 = 1953658222;
                                }
                                zzagcVar = zzagcVar3;
                                byte[] bArr5 = bArr4;
                                zzahe zzaheVar7 = zzaheVar3;
                                i10 = size3;
                                i12 = i24;
                                zzagc zzagcVar5 = zzagcVar4;
                                zzahc zzahcVar4 = zzagsVar2.zzd.zza;
                                zzago zzagoVar3 = zzaheVar7.zza;
                                Objects.requireNonNull(zzagoVar3);
                                zzahd zzahdVarZza = zzahcVar4.zza(zzagoVar3.zza);
                                zzagd zzagdVarZzb3 = zzagcVar5.zzb(1935763834);
                                if (zzagdVarZzb3 != null) {
                                    Objects.requireNonNull(zzahdVarZza);
                                    zzfa zzfaVar7 = zzagdVarZzb3.zza;
                                    int i41 = zzahdVarZza.zzd;
                                    zzfaVar7.zzF(8);
                                    if ((zzfaVar7.zze() & 1) == 1) {
                                        zzfaVar7.zzG(8);
                                    }
                                    int iZzk = zzfaVar7.zzk();
                                    int iZzn2 = zzfaVar7.zzn();
                                    int i42 = zzaheVar7.zze;
                                    if (iZzn2 > i42) {
                                        throw zzcd.zza("Saiz sample count " + iZzn2 + " is greater than fragment sample count" + i42, null);
                                    }
                                    if (iZzk == 0) {
                                        boolean[] zArr2 = zzaheVar7.zzl;
                                        i14 = 0;
                                        for (int i43 = 0; i43 < iZzn2; i43++) {
                                            int iZzk2 = zzfaVar7.zzk();
                                            i14 += iZzk2;
                                            zArr2[i43] = iZzk2 > i41;
                                        }
                                        z10 = false;
                                    } else {
                                        boolean z14 = iZzk > i41;
                                        i14 = iZzk * iZzn2;
                                        z10 = false;
                                        Arrays.fill(zzaheVar7.zzl, 0, iZzn2, z14);
                                    }
                                    Arrays.fill(zzaheVar7.zzl, iZzn2, zzaheVar7.zze, z10);
                                    if (i14 > 0) {
                                        zzaheVar7.zza(i14);
                                    }
                                }
                                zzagd zzagdVarZzb4 = zzagcVar5.zzb(1935763823);
                                if (zzagdVarZzb4 != null) {
                                    zzfa zzfaVar8 = zzagdVarZzb4.zza;
                                    zzfaVar8.zzF(8);
                                    int iZze7 = zzfaVar8.zze();
                                    if ((iZze7 & 1) == 1) {
                                        zzfaVar8.zzG(8);
                                    }
                                    int iZzn3 = zzfaVar8.zzn();
                                    if (iZzn3 != 1) {
                                        throw zzcd.zza("Unexpected saio entry count: " + iZzn3, null);
                                    }
                                    zzaheVar7.zzc += zzage.zze(iZze7) == 0 ? zzfaVar8.zzs() : zzfaVar8.zzt();
                                }
                                zzagd zzagdVarZzb5 = zzagcVar5.zzb(1936027235);
                                if (zzagdVarZzb5 != null) {
                                    zzh(zzagdVarZzb5.zza, 0, zzaheVar7);
                                }
                                String str = zzahdVarZza != null ? zzahdVarZza.zzb : null;
                                zzfa zzfaVar9 = null;
                                zzfa zzfaVar10 = null;
                                for (int i44 = 0; i44 < zzagcVar5.zzb.size(); i44++) {
                                    zzagd zzagdVar4 = (zzagd) zzagcVar5.zzb.get(i44);
                                    zzfa zzfaVar11 = zzagdVar4.zza;
                                    int i45 = zzagdVar4.zzd;
                                    if (i45 == 1935828848) {
                                        zzfaVar11.zzF(12);
                                        if (zzfaVar11.zze() == 1936025959) {
                                            zzfaVar9 = zzfaVar11;
                                        }
                                    } else if (i45 == 1936158820) {
                                        zzfaVar11.zzF(12);
                                        if (zzfaVar11.zze() == 1936025959) {
                                            zzfaVar10 = zzfaVar11;
                                        }
                                    }
                                }
                                if (zzfaVar9 != null && zzfaVar10 != null) {
                                    zzfaVar9.zzF(8);
                                    int iZze8 = zzage.zze(zzfaVar9.zze());
                                    zzfaVar9.zzG(4);
                                    if (iZze8 == 1) {
                                        zzfaVar9.zzG(4);
                                    }
                                    if (zzfaVar9.zze() != 1) {
                                        throw zzcd.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzfaVar10.zzF(8);
                                    int iZze9 = zzage.zze(zzfaVar10.zze());
                                    zzfaVar10.zzG(4);
                                    if (iZze9 == 1) {
                                        if (zzfaVar10.zzs() == 0) {
                                            throw zzcd.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZze9 >= 2) {
                                        zzfaVar10.zzG(4);
                                    }
                                    if (zzfaVar10.zzs() != 1) {
                                        throw zzcd.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzfaVar10.zzG(1);
                                    int iZzk3 = zzfaVar10.zzk();
                                    int i46 = (iZzk3 & 240) >> 4;
                                    int i47 = iZzk3 & 15;
                                    if (zzfaVar10.zzk() == 1) {
                                        int iZzk4 = zzfaVar10.zzk();
                                        byte[] bArr6 = new byte[16];
                                        zzfaVar10.zzB(bArr6, 0, 16);
                                        if (iZzk4 == 0) {
                                            int iZzk5 = zzfaVar10.zzk();
                                            byte[] bArr7 = new byte[iZzk5];
                                            zzfaVar10.zzB(bArr7, 0, iZzk5);
                                            bArr3 = bArr7;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzaheVar7.zzk = true;
                                        zzaheVar7.zzm = new zzahd(true, str, iZzk4, bArr6, i46, i47, bArr3);
                                    }
                                }
                                int size5 = zzagcVar5.zzb.size();
                                int i48 = 0;
                                while (i48 < size5) {
                                    zzagd zzagdVar5 = (zzagd) zzagcVar5.zzb.get(i48);
                                    if (zzagdVar5.zzd == 1970628964) {
                                        zzfa zzfaVar12 = zzagdVar5.zza;
                                        zzfaVar12.zzF(8);
                                        bArr2 = bArr5;
                                        zzfaVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzfaVar12, 16, zzaheVar7);
                                        }
                                    } else {
                                        bArr2 = bArr5;
                                    }
                                    i48++;
                                    bArr5 = bArr2;
                                }
                                bArr = bArr5;
                                i11 = 8;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            zzagcVar = zzagcVar3;
                            i10 = size3;
                            i11 = i19;
                            i12 = i24;
                            bArr = bArr4;
                        }
                        i19 = i11;
                        bArr4 = bArr;
                        size3 = i10;
                        zzagcVar3 = zzagcVar;
                        i24 = i12 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzad zzadVarZzf2 = zzf(zzagcVar3.zzb);
                    zzagtVar = this;
                    if (zzadVarZzf2 != null) {
                        int size6 = zzagtVar.zze.size();
                        for (int i49 = 0; i49 < size6; i49++) {
                            zzags zzagsVar3 = (zzags) zzagtVar.zze.valueAt(i49);
                            zzahc zzahcVar5 = zzagsVar3.zzd.zza;
                            zzago zzagoVar4 = zzagsVar3.zzb.zza;
                            int i50 = zzfj.zza;
                            zzahd zzahdVarZza2 = zzahcVar5.zza(zzagoVar4.zza);
                            zzad zzadVarZzb = zzadVarZzf2.zzb(zzahdVarZza2 != null ? zzahdVarZza2.zzb : null);
                            zzak zzakVarZzb = zzagsVar3.zzd.zza.zzf.zzb();
                            zzakVarZzb.zzB(zzadVarZzb);
                            zzagsVar3.zza.zzk(zzakVarZzb.zzY());
                        }
                    }
                    if (zzagtVar.zzv != -9223372036854775807L) {
                        int size7 = zzagtVar.zze.size();
                        for (int i51 = 0; i51 < size7; i51++) {
                            zzags zzagsVar4 = (zzags) zzagtVar.zze.valueAt(i51);
                            long j19 = zzagtVar.zzv;
                            int i52 = zzagsVar4.zzf;
                            while (true) {
                                zzahe zzaheVar8 = zzagsVar4.zzb;
                                if (i52 >= zzaheVar8.zze || zzaheVar8.zzi[i52] > j19) {
                                    break;
                                }
                                if (zzaheVar8.zzj[i52]) {
                                    zzagsVar4.zzi = i52;
                                }
                                i52++;
                            }
                        }
                        zzagtVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzagtVar = zzagtVar2;
                    if (!zzagtVar.zzm.isEmpty()) {
                        ((zzagc) zzagtVar.zzm.peek()).zzc(zzagcVar3);
                    }
                }
                zzagtVar2 = zzagtVar;
            }
        }
        zzg();
    }

    private static final zzago zzj(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzago) sparseArray.valueAt(0);
        }
        zzago zzagoVar = (zzago) sparseArray.get(i10);
        Objects.requireNonNull(zzagoVar);
        return zzagoVar;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0530 A[PHI: r1 r2 r5
  0x0530: PHI (r1v2 com.google.android.gms.internal.ads.zzaax) = (r1v1 com.google.android.gms.internal.ads.zzaax), (r1v4 com.google.android.gms.internal.ads.zzaax) binds: [B:307:0x072a, B:176:0x052c] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r2v47 long) = (r2v5 long), (r2v51 long) binds: [B:307:0x072a, B:176:0x052c] A[DONT_GENERATE, DONT_INLINE]
  0x0530: PHI (r5v2 com.google.android.gms.internal.ads.zzagt) = (r5v1 com.google.android.gms.internal.ads.zzagt), (r5v10 com.google.android.gms.internal.ads.zzagt) binds: [B:307:0x072a, B:176:0x052c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:211:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f3 A[LOOP:10: B:212:0x05f1->B:213:0x05f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x0608  */
    /* JADX WARN: Code duplicated, block: B:217:0x0613  */
    /* JADX WARN: Code duplicated, block: B:309:0x072e A[PHI: r5
  0x072e: PHI (r5v5 com.google.android.gms.internal.ads.zzagt) = (r5v1 com.google.android.gms.internal.ads.zzagt), (r5v36 com.google.android.gms.internal.ads.zzagt) binds: [B:307:0x072a, B:29:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:318:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        int i10;
        ?? r10;
        zzagt zzagtVar;
        long jZzf;
        long j10;
        long j11;
        long jZzf2;
        int i11;
        int i12;
        long jZzf3;
        zzfa zzfaVar;
        int i13;
        int size;
        int i14;
        String str;
        String str2;
        long jZzp;
        long jZzs;
        long j12;
        long j13;
        ArrayDeque arrayDeque;
        zzagr zzagrVar;
        long jZzt;
        long jZzt2;
        zzags zzagsVar;
        int iZze;
        boolean z10;
        int iZzc;
        zzagt zzagtVar2 = this;
        zzaax zzaaxVar2 = zzaaxVar;
        while (true) {
            int i15 = zzagtVar2.zzo;
            i10 = 1;
            r10 = 0;
            if (i15 == 0) {
                zzagtVar = zzagtVar2;
                if (zzagtVar.zzr == 0) {
                    if (!zzaaxVar2.zzn(zzagtVar.zzl.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    zzagtVar.zzr = 8;
                    zzagtVar.zzl.zzF(0);
                    zzagtVar.zzq = zzagtVar.zzl.zzs();
                    zzagtVar.zzp = zzagtVar.zzl.zze();
                }
                long j14 = zzagtVar.zzq;
                if (j14 == 1) {
                    ((zzaam) zzaaxVar2).zzn(zzagtVar.zzl.zzH(), 8, 8, false);
                    zzagtVar.zzr += 8;
                    jZzf = zzagtVar.zzl.zzt();
                } else {
                    if (j14 == 0) {
                        long jZzd = zzaaxVar.zzd();
                        if (jZzd == -1) {
                            jZzd = !zzagtVar.zzm.isEmpty() ? ((zzagc) zzagtVar.zzm.peek()).zza : -1L;
                        }
                        if (jZzd != -1) {
                            jZzf = (jZzd - zzaaxVar.zzf()) + ((long) zzagtVar.zzr);
                        }
                        zzagtVar.zzo = i13;
                    }
                    j10 = zzagtVar.zzq;
                    j11 = zzagtVar.zzr;
                    if (j10 >= j11) {
                        throw zzcd.zzc("Atom size less than header length (unsupported).");
                    }
                    jZzf2 = zzaaxVar.zzf() - j11;
                    i11 = zzagtVar.zzp;
                    if ((i11 != 1836019558 || i11 == 1835295092) && !zzagtVar.zzG) {
                        zzagtVar.zzD.zzN(new zzabu(zzagtVar.zzw, jZzf2));
                        zzagtVar.zzG = true;
                    }
                    if (zzagtVar.zzp == 1836019558) {
                        size = zzagtVar.zze.size();
                        for (i14 = 0; i14 < size; i14++) {
                            zzahe zzaheVar = ((zzags) zzagtVar.zze.valueAt(i14)).zzb;
                            zzaheVar.zzc = jZzf2;
                            zzaheVar.zzb = jZzf2;
                        }
                    }
                    i12 = zzagtVar.zzp;
                    if (i12 == 1835295092) {
                        zzagtVar.zzy = null;
                        zzagtVar.zzt = jZzf2 + zzagtVar.zzq;
                        i13 = 2;
                    } else if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                        jZzf3 = (zzaaxVar.zzf() + zzagtVar.zzq) - 8;
                        zzagtVar.zzm.push(new zzagc(i12, jZzf3));
                        if (zzagtVar.zzq == zzagtVar.zzr) {
                            zzagtVar.zzi(jZzf3);
                        } else {
                            zzg();
                        }
                    } else {
                        if (i12 == 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                            if (zzagtVar.zzr != 8) {
                                throw zzcd.zzc("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (zzagtVar.zzq > 2147483647L) {
                                throw zzcd.zzc("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            zzfaVar = new zzfa((int) zzagtVar.zzq);
                            System.arraycopy(zzagtVar.zzl.zzH(), 0, zzfaVar.zzH(), 0, 8);
                        } else {
                            if (zzagtVar.zzq > 2147483647L) {
                                throw zzcd.zzc("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            zzfaVar = null;
                        }
                        zzagtVar.zzs = zzfaVar;
                        i13 = 1;
                    }
                    zzagtVar.zzo = i13;
                }
                zzagtVar.zzq = jZzf;
                j10 = zzagtVar.zzq;
                j11 = zzagtVar.zzr;
                if (j10 >= j11) {
                    throw zzcd.zzc("Atom size less than header length (unsupported).");
                }
                jZzf2 = zzaaxVar.zzf() - j11;
                i11 = zzagtVar.zzp;
                if (i11 != 1836019558) {
                    zzagtVar.zzD.zzN(new zzabu(zzagtVar.zzw, jZzf2));
                    zzagtVar.zzG = true;
                } else {
                    zzagtVar.zzD.zzN(new zzabu(zzagtVar.zzw, jZzf2));
                    zzagtVar.zzG = true;
                }
                if (zzagtVar.zzp == 1836019558) {
                    size = zzagtVar.zze.size();
                    while (i14 < size) {
                        zzahe zzaheVar2 = ((zzags) zzagtVar.zze.valueAt(i14)).zzb;
                        zzaheVar2.zzc = jZzf2;
                        zzaheVar2.zzb = jZzf2;
                    }
                }
                i12 = zzagtVar.zzp;
                if (i12 == 1835295092) {
                    zzagtVar.zzy = null;
                    zzagtVar.zzt = jZzf2 + zzagtVar.zzq;
                    i13 = 2;
                } else {
                    if (i12 != 1836019574) {
                    }
                    jZzf3 = (zzaaxVar.zzf() + zzagtVar.zzq) - 8;
                    zzagtVar.zzm.push(new zzagc(i12, jZzf3));
                    if (zzagtVar.zzq == zzagtVar.zzr) {
                        zzagtVar.zzi(jZzf3);
                    } else {
                        zzg();
                    }
                }
                zzagtVar.zzo = i13;
            } else if (i15 == 1) {
                int i16 = ((int) zzagtVar2.zzq) - zzagtVar2.zzr;
                zzfa zzfaVar2 = zzagtVar2.zzs;
                if (zzfaVar2 != null) {
                    ((zzaam) zzaaxVar2).zzn(zzfaVar2.zzH(), 8, i16, false);
                    zzagd zzagdVar = new zzagd(zzagtVar2.zzp, zzfaVar2);
                    long jZzf4 = zzaaxVar.zzf();
                    if (zzagtVar2.zzm.isEmpty()) {
                        int i17 = zzagdVar.zzd;
                        if (i17 == 1936286840) {
                            zzfa zzfaVar3 = zzagdVar.zza;
                            zzfaVar3.zzF(8);
                            int iZze2 = zzage.zze(zzfaVar3.zze());
                            zzfaVar3.zzG(4);
                            long jZzs2 = zzfaVar3.zzs();
                            if (iZze2 == 0) {
                                jZzt = zzfaVar3.zzs();
                                jZzt2 = zzfaVar3.zzs();
                            } else {
                                jZzt = zzfaVar3.zzt();
                                jZzt2 = zzfaVar3.zzt();
                            }
                            long j15 = jZzt;
                            long j16 = jZzf4 + jZzt2;
                            long jZzp2 = zzfj.zzp(j15, 1000000L, jZzs2);
                            zzfaVar3.zzG(2);
                            int iZzo = zzfaVar3.zzo();
                            int[] iArr = new int[iZzo];
                            long[] jArr = new long[iZzo];
                            long[] jArr2 = new long[iZzo];
                            long[] jArr3 = new long[iZzo];
                            long j17 = jZzp2;
                            int i18 = 0;
                            long j18 = j15;
                            while (i18 < iZzo) {
                                int iZze3 = zzfaVar3.zze();
                                if ((iZze3 & Integer.MIN_VALUE) != 0) {
                                    throw zzcd.zza("Unhandled indirect reference", null);
                                }
                                long jZzs3 = zzfaVar3.zzs();
                                iArr[i18] = iZze3 & Integer.MAX_VALUE;
                                jArr[i18] = j16;
                                jArr3[i18] = j17;
                                long j19 = j18 + jZzs3;
                                int i19 = iZzo;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int[] iArr2 = iArr;
                                long jZzp3 = zzfj.zzp(j19, 1000000L, jZzs2);
                                jArr4[i18] = jZzp3 - jArr5[i18];
                                zzfaVar3.zzG(4);
                                j16 += (long) iArr2[i18];
                                i18++;
                                iArr = iArr2;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                jArr = jArr;
                                iZzo = i19;
                                j18 = j19;
                                j17 = jZzp3;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzp2), new zzaak(iArr, jArr, jArr2, jArr3));
                            zzagtVar = this;
                            zzagtVar.zzx = ((Long) pairCreate.first).longValue();
                            zzagtVar.zzD.zzN((zzabv) pairCreate.second);
                            zzagtVar.zzG = true;
                        } else {
                            zzagtVar = zzagtVar2;
                            if (i17 == 1701671783) {
                                zzfa zzfaVar4 = zzagdVar.zza;
                                if (zzagtVar.zzE.length != 0) {
                                    zzfaVar4.zzF(8);
                                    int iZze4 = zzage.zze(zzfaVar4.zze());
                                    if (iZze4 == 0) {
                                        String strZzv = zzfaVar4.zzv((char) 0);
                                        Objects.requireNonNull(strZzv);
                                        String strZzv2 = zzfaVar4.zzv((char) 0);
                                        Objects.requireNonNull(strZzv2);
                                        long jZzs4 = zzfaVar4.zzs();
                                        long jZzp4 = zzfj.zzp(zzfaVar4.zzs(), 1000000L, jZzs4);
                                        long j20 = zzagtVar.zzx;
                                        long j21 = j20 != -9223372036854775807L ? j20 + jZzp4 : -9223372036854775807L;
                                        str = strZzv2;
                                        str2 = strZzv;
                                        jZzp = zzfj.zzp(zzfaVar4.zzs(), 1000L, jZzs4);
                                        jZzs = zzfaVar4.zzs();
                                        j12 = jZzp4;
                                        j13 = j21;
                                    } else if (iZze4 != 1) {
                                        zzer.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iZze4);
                                    } else {
                                        long jZzs5 = zzfaVar4.zzs();
                                        long jZzp5 = zzfj.zzp(zzfaVar4.zzt(), 1000000L, jZzs5);
                                        long jZzp6 = zzfj.zzp(zzfaVar4.zzs(), 1000L, jZzs5);
                                        long jZzs6 = zzfaVar4.zzs();
                                        String strZzv3 = zzfaVar4.zzv((char) 0);
                                        Objects.requireNonNull(strZzv3);
                                        String strZzv4 = zzfaVar4.zzv((char) 0);
                                        Objects.requireNonNull(strZzv4);
                                        str = strZzv4;
                                        str2 = strZzv3;
                                        jZzp = jZzp6;
                                        j13 = jZzp5;
                                        jZzs = jZzs6;
                                        j12 = -9223372036854775807L;
                                    }
                                    byte[] bArr = new byte[zzfaVar4.zza()];
                                    zzfaVar4.zzB(bArr, 0, zzfaVar4.zza());
                                    zzfa zzfaVar5 = new zzfa(zzagtVar.zzk.zza(new zzadp(str2, str, jZzp, jZzs, bArr)));
                                    int iZza = zzfaVar5.zza();
                                    for (zzabz zzabzVar : zzagtVar.zzE) {
                                        zzfaVar5.zzF(0);
                                        zzabzVar.zzq(zzfaVar5, iZza);
                                    }
                                    if (j13 == -9223372036854775807L) {
                                        arrayDeque = zzagtVar.zzn;
                                        zzagrVar = new zzagr(j12, true, iZza);
                                    } else if (zzagtVar.zzn.isEmpty()) {
                                        for (zzabz zzabzVar2 : zzagtVar.zzE) {
                                            zzabzVar2.zzs(j13, 1, iZza, 0, null);
                                        }
                                    } else {
                                        arrayDeque = zzagtVar.zzn;
                                        zzagrVar = new zzagr(j13, false, iZza);
                                    }
                                    arrayDeque.addLast(zzagrVar);
                                    zzagtVar.zzu += iZza;
                                }
                            }
                        }
                        zzaaxVar2 = zzaaxVar;
                    } else {
                        ((zzagc) zzagtVar2.zzm.peek()).zzd(zzagdVar);
                        zzagtVar = zzagtVar2;
                    }
                } else {
                    zzagtVar = zzagtVar2;
                    ((zzaam) zzaaxVar2).zzo(i16, false);
                }
                jZzf3 = zzaaxVar.zzf();
                zzagtVar.zzi(jZzf3);
            } else if (i15 != 2) {
                zzagsVar = zzagtVar2.zzy;
                if (zzagsVar != null) {
                    break;
                }
                SparseArray sparseArray = zzagtVar2.zze;
                int size2 = sparseArray.size();
                long j22 = Long.MAX_VALUE;
                zzags zzagsVar2 = null;
                for (int i20 = 0; i20 < size2; i20++) {
                    zzags zzagsVar3 = (zzags) sparseArray.valueAt(i20);
                    if ((zzagsVar3.zzl || zzagsVar3.zzf != zzagsVar3.zzd.zzb) && (!zzagsVar3.zzl || zzagsVar3.zzh != zzagsVar3.zzb.zzd)) {
                        long jZzd2 = zzagsVar3.zzd();
                        if (jZzd2 < j22) {
                            zzagsVar2 = zzagsVar3;
                            j22 = jZzd2;
                        }
                    }
                }
                if (zzagsVar2 != null) {
                    int iZzd = (int) (zzagsVar2.zzd() - zzaaxVar.zzf());
                    if (iZzd < 0) {
                        zzer.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                        iZzd = 0;
                    }
                    ((zzaam) zzaaxVar2).zzo(iZzd, false);
                    zzagtVar2.zzy = zzagsVar2;
                    zzagsVar = zzagsVar2;
                    break;
                }
                int iZzf = (int) (zzagtVar2.zzt - zzaaxVar.zzf());
                if (iZzf < 0) {
                    throw zzcd.zza("Offset to end of mdat was negative.", null);
                }
                ((zzaam) zzaaxVar2).zzo(iZzf, false);
                zzagtVar = zzagtVar2;
                zzg();
            } else {
                int size3 = zzagtVar2.zze.size();
                long j23 = Long.MAX_VALUE;
                zzags zzagsVar4 = null;
                for (int i21 = 0; i21 < size3; i21++) {
                    zzahe zzaheVar3 = ((zzags) zzagtVar2.zze.valueAt(i21)).zzb;
                    if (zzaheVar3.zzo) {
                        long j24 = zzaheVar3.zzc;
                        if (j24 < j23) {
                            zzagsVar4 = (zzags) zzagtVar2.zze.valueAt(i21);
                            j23 = j24;
                        }
                    }
                }
                if (zzagsVar4 == null) {
                    i13 = 3;
                    zzagtVar = zzagtVar2;
                    zzagtVar.zzo = i13;
                } else {
                    int iZzf2 = (int) (j23 - zzaaxVar.zzf());
                    if (iZzf2 < 0) {
                        throw zzcd.zza("Offset to encryption data was negative.", null);
                    }
                    zzaam zzaamVar = (zzaam) zzaaxVar2;
                    zzaamVar.zzo(iZzf2, false);
                    zzahe zzaheVar4 = zzagsVar4.zzb;
                    zzfa zzfaVar6 = zzaheVar4.zzn;
                    zzaamVar.zzn(zzfaVar6.zzH(), 0, zzfaVar6.zzd(), false);
                    zzaheVar4.zzn.zzF(0);
                    zzaheVar4.zzo = false;
                    zzagtVar = zzagtVar2;
                }
            }
            zzagtVar2 = zzagtVar;
        }
        char c10 = 6;
        if (zzagtVar2.zzo == 3) {
            int iZzb = zzagsVar.zzb();
            zzagtVar2.zzz = iZzb;
            if (zzagsVar.zzf < zzagsVar.zzi) {
                ((zzaam) zzaaxVar2).zzo(iZzb, false);
                zzahd zzahdVarZzf = zzagsVar.zzf();
                if (zzahdVarZzf != null) {
                    zzfa zzfaVar7 = zzagsVar.zzb.zzn;
                    int i22 = zzahdVarZzf.zzd;
                    if (i22 != 0) {
                        zzfaVar7.zzG(i22);
                    }
                    if (zzagsVar.zzb.zzb(zzagsVar.zzf)) {
                        zzfaVar7.zzG(zzfaVar7.zzo() * 6);
                    }
                }
                if (!zzagsVar.zzk()) {
                    zzagtVar2.zzy = null;
                }
                zzagtVar2.zzo = 3;
                return 0;
            }
            if (zzagsVar.zzd.zza.zzg == 1) {
                zzagtVar2.zzz = iZzb - 8;
                ((zzaam) zzaaxVar2).zzo(8, false);
            }
            if ("audio/ac4".equals(zzagsVar.zzd.zza.zzf.zzm)) {
                zzagtVar2.zzA = zzagsVar.zzc(zzagtVar2.zzz, 7);
                zzaaa.zzb(zzagtVar2.zzz, zzagtVar2.zzj);
                zzagsVar.zza.zzq(zzagtVar2.zzj, 7);
                iZzc = zzagtVar2.zzA + 7;
            } else {
                iZzc = zzagsVar.zzc(zzagtVar2.zzz, 0);
            }
            zzagtVar2.zzA = iZzc;
            zzagtVar2.zzz += iZzc;
            zzagtVar2.zzo = 4;
            zzagtVar2.zzB = 0;
        }
        zzahc zzahcVar = zzagsVar.zzd.zza;
        zzabz zzabzVar3 = zzagsVar.zza;
        long jZze = zzagsVar.zze();
        int i23 = zzahcVar.zzj;
        if (i23 == 0) {
            while (true) {
                int i24 = zzagtVar2.zzA;
                int i25 = zzagtVar2.zzz;
                if (i24 >= i25) {
                    break;
                }
                zzagtVar2.zzA += zzabzVar3.zze(zzaaxVar2, i25 - i24, false);
            }
        } else {
            byte[] bArrZzH = zzagtVar2.zzg.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 0;
            bArrZzH[2] = 0;
            int i26 = i23 + 1;
            int i27 = 4 - i23;
            while (zzagtVar2.zzA < zzagtVar2.zzz) {
                int i28 = zzagtVar2.zzB;
                if (i28 == 0) {
                    ((zzaam) zzaaxVar2).zzn(bArrZzH, i27, i26, r10);
                    zzagtVar2.zzg.zzF(r10);
                    int iZze5 = zzagtVar2.zzg.zze();
                    if (iZze5 <= 0) {
                        throw zzcd.zza("Invalid NAL length", null);
                    }
                    zzagtVar2.zzB = iZze5 - 1;
                    zzagtVar2.zzf.zzF(r10);
                    zzabzVar3.zzq(zzagtVar2.zzf, 4);
                    zzabzVar3.zzq(zzagtVar2.zzg, i10);
                    if (zzagtVar2.zzF.length > 0) {
                        String str3 = zzahcVar.zzf.zzm;
                        byte b10 = bArrZzH[4];
                        byte[] bArr2 = zzfu.zza;
                        if (("video/avc".equals(str3) && (b10 & Ascii.US) == c10) || ("video/hevc".equals(str3) && ((b10 & 126) >> i10) == 39)) {
                            z10 = i10;
                        } else {
                            z10 = 0;
                        }
                    } else {
                        z10 = 0;
                    }
                    zzagtVar2.zzC = z10;
                    zzagtVar2.zzA += 5;
                    zzagtVar2.zzz += i27;
                } else {
                    if (zzagtVar2.zzC) {
                        zzagtVar2.zzh.zzC(i28);
                        ((zzaam) zzaaxVar2).zzn(zzagtVar2.zzh.zzH(), 0, zzagtVar2.zzB, false);
                        zzabzVar3.zzq(zzagtVar2.zzh, zzagtVar2.zzB);
                        iZze = zzagtVar2.zzB;
                        zzfa zzfaVar8 = zzagtVar2.zzh;
                        int iZzb2 = zzfu.zzb(zzfaVar8.zzH(), zzfaVar8.zzd());
                        zzagtVar2.zzh.zzF("video/hevc".equals(zzahcVar.zzf.zzm) ? 1 : 0);
                        zzagtVar2.zzh.zzE(iZzb2);
                        zzaaj.zza(jZze, zzagtVar2.zzh, zzagtVar2.zzF);
                    } else {
                        iZze = zzabzVar3.zze(zzaaxVar2, i28, false);
                    }
                    zzagtVar2.zzA += iZze;
                    zzagtVar2.zzB -= iZze;
                    c10 = 6;
                    i10 = 1;
                }
                r10 = 0;
            }
        }
        int iZza2 = zzagsVar.zza();
        zzahd zzahdVarZzf2 = zzagsVar.zzf();
        zzabzVar3.zzs(jZze, iZza2, zzagtVar2.zzz, 0, zzahdVarZzf2 != null ? zzahdVarZzf2.zzc : null);
        while (!zzagtVar2.zzn.isEmpty()) {
            zzagr zzagrVar2 = (zzagr) zzagtVar2.zzn.removeFirst();
            zzagtVar2.zzu -= zzagrVar2.zzc;
            long j25 = zzagrVar2.zza;
            if (zzagrVar2.zzb) {
                j25 += jZze;
            }
            for (zzabz zzabzVar4 : zzagtVar2.zzE) {
                zzabzVar4.zzs(j25, 1, zzagrVar2.zzc, zzagtVar2.zzu, null);
            }
        }
        if (!zzagsVar.zzk()) {
            zzagtVar2.zzy = null;
        }
        zzagtVar2.zzo = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzD = zzaazVar;
        zzg();
        zzabz[] zzabzVarArr = new zzabz[2];
        this.zzE = zzabzVarArr;
        int i10 = 0;
        zzabz[] zzabzVarArr2 = (zzabz[]) zzfj.zzG(zzabzVarArr, 0);
        this.zzE = zzabzVarArr2;
        for (zzabz zzabzVar : zzabzVarArr2) {
            zzabzVar.zzk(zzc);
        }
        this.zzF = new zzabz[this.zzd.size()];
        int i11 = 100;
        while (i10 < this.zzF.length) {
            int i12 = i11 + 1;
            zzabz zzabzVarZzv = this.zzD.zzv(i11, 3);
            zzabzVarZzv.zzk((zzam) this.zzd.get(i10));
            this.zzF[i10] = zzabzVarZzv;
            i10++;
            i11 = i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        int size = this.zze.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzags) this.zze.valueAt(i10)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j11;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        return zzahb.zza(zzaaxVar);
    }
}
