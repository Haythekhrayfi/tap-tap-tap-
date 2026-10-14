package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgon implements zzgrh {
    private final zzgom zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgon(zzgom zzgomVar) {
        byte[] bArr = zzgpw.zzd;
        this.zza = zzgomVar;
        zzgomVar.zzc = this;
    }

    private final void zzP(Object obj, zzgrp zzgrpVar, zzgoy zzgoyVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgrpVar.zzh(obj, this, zzgoyVar);
            if (this.zzb != this.zzc) {
                throw zzgpy.zzg();
            }
            this.zzc = i10;
        } catch (Throwable th) {
            this.zzc = i10;
            throw th;
        }
    }

    private final void zzQ(Object obj, zzgrp zzgrpVar, zzgoy zzgoyVar) throws IOException {
        int iZzn = this.zza.zzn();
        zzgom zzgomVar = this.zza;
        if (zzgomVar.zza >= zzgomVar.zzb) {
            throw new zzgpy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = zzgomVar.zze(iZzn);
        this.zza.zza++;
        zzgrpVar.zzh(obj, this, zzgoyVar);
        this.zza.zzz(0);
        zzgom zzgomVar2 = this.zza;
        zzgomVar2.zza--;
        zzgomVar2.zzA(iZze);
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() != i10) {
            throw zzgpy.zzj();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw zzgpy.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzgpy.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzgpy.zzg();
        }
    }

    public static zzgon zzq(zzgom zzgomVar) {
        zzgon zzgonVar = zzgomVar.zzc;
        return zzgonVar != null ? zzgonVar : new zzgon(zzgomVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzA(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgql)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzn = this.zza.zzn();
            zzU(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzgql zzgqlVar = (zzgql) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzgqlVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzU(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzgqlVar.zzg(this.zza.zzo());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzB(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpf)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw zzgpy.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgpf zzgpfVar = (zzgpf) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzn2 = this.zza.zzn();
            zzT(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzgpfVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i11 != 5) {
            throw zzgpy.zza();
        }
        do {
            zzgpfVar.zze(this.zza.zzc());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    @Deprecated
    public final void zzC(List list, zzgrp zzgrpVar, zzgoy zzgoyVar) throws IOException {
        int iZzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzgpy.zza();
        }
        do {
            Object objZze = zzgrpVar.zze();
            zzP(objZze, zzgrpVar, zzgoyVar);
            zzgrpVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i10);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzD(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpn)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgpn zzgpnVar = (zzgpn) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgpnVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpnVar.zzh(this.zza.zzh());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzE(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgql)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgql zzgqlVar = (zzgql) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgqlVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgqlVar.zzg(this.zza.zzp());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzF(List list, zzgrp zzgrpVar, zzgoy zzgoyVar) throws IOException {
        int iZzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzgpy.zza();
        }
        do {
            Object objZze = zzgrpVar.zze();
            zzQ(objZze, zzgrpVar, zzgoyVar);
            zzgrpVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i10);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzG(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpn)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw zzgpy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgpn zzgpnVar = (zzgpn) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzn2 = this.zza.zzn();
            zzT(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzgpnVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i11 != 5) {
            throw zzgpy.zza();
        }
        do {
            zzgpnVar.zzh(this.zza.zzk());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzH(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgql)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzn = this.zza.zzn();
            zzU(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzgql zzgqlVar = (zzgql) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzgqlVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzU(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzgqlVar.zzg(this.zza.zzt());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzI(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpn)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgpn zzgpnVar = (zzgpn) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgpnVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpnVar.zzh(this.zza.zzl());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzJ(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgql)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzu()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgql zzgqlVar = (zzgql) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgqlVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgqlVar.zzg(this.zza.zzu());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgpy.zza();
        }
        if (!(list instanceof zzgqe) || z10) {
            do {
                list.add(z10 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgqe zzgqeVar = (zzgqe) list;
        do {
            zzgqeVar.zzi(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzL(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpn)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgpn zzgpnVar = (zzgpn) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgpnVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpnVar.zzh(this.zza.zzn());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzM(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgql)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzv()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgql zzgqlVar = (zzgql) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgqlVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgqlVar.zzg(this.zza.zzv());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final boolean zzO() throws IOException {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final zzgoe zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzt(Object obj, zzgrp zzgrpVar, zzgoy zzgoyVar) throws IOException {
        zzS(3);
        zzP(obj, zzgrpVar, zzgoyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzu(Object obj, zzgrp zzgrpVar, zzgoy zzgoyVar) throws IOException {
        zzS(2);
        zzQ(obj, zzgrpVar, zzgoyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzv(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgns)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgns zzgnsVar = (zzgns) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgnsVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgnsVar.zze(this.zza.zzD());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzw(List list) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zzgpy.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzx(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgov)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzn = this.zza.zzn();
            zzU(iZzn);
            int iZzd = this.zza.zzd() + iZzn;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzd() < iZzd);
            return;
        }
        zzgov zzgovVar = (zzgov) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzgovVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzn2 = this.zza.zzn();
        zzU(iZzn2);
        int iZzd2 = this.zza.zzd() + iZzn2;
        do {
            zzgovVar.zze(this.zza.zzb());
        } while (this.zza.zzd() < iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzy(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpn)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        iZzm = this.zza.zzm();
                    }
                } while (iZzm == this.zzb);
                this.zzd = iZzm;
                return;
            }
            if (i10 != 2) {
                throw zzgpy.zza();
            }
            int iZzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzd() < iZzd);
            zzR(iZzd);
            return;
        }
        zzgpn zzgpnVar = (zzgpn) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzgpnVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
            this.zzd = iZzm2;
            return;
        }
        if (i11 != 2) {
            throw zzgpy.zza();
        }
        int iZzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgpnVar.zzh(this.zza.zzf());
        } while (this.zza.zzd() < iZzd2);
        zzR(iZzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final void zzz(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (!(list instanceof zzgpn)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzn = this.zza.zzn();
                zzT(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i10 != 5) {
                throw zzgpy.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            this.zzd = iZzm;
            return;
        }
        zzgpn zzgpnVar = (zzgpn) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzn2 = this.zza.zzn();
            zzT(iZzn2);
            int iZzd2 = this.zza.zzd() + iZzn2;
            do {
                zzgpnVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < iZzd2);
            return;
        }
        if (i11 != 5) {
            throw zzgpy.zza();
        }
        do {
            zzgpnVar.zzh(this.zza.zzg());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm2 = this.zza.zzm();
            }
        } while (iZzm2 == this.zzb);
        this.zzd = iZzm2;
    }
}
