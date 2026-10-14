package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgpm<MessageType extends zzgpm<MessageType, BuilderType>, BuilderType extends zzgpi<MessageType, BuilderType>> extends zzgnn<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public zzgsh zzc = zzgsh.zzc();

    private final int zza(zzgrp zzgrpVar) {
        return zzgre.zza().zzb(getClass()).zza(this);
    }

    public static zzgpm zzaC(Class cls) {
        Map map = zzb;
        zzgpm zzgpmVar = (zzgpm) map.get(cls);
        if (zzgpmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgpmVar = (zzgpm) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgpmVar == null) {
            zzgpmVar = (zzgpm) ((zzgpm) zzgsq.zzg(cls)).zzb(6, null, null);
            if (zzgpmVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgpmVar);
        }
        return zzgpmVar;
    }

    public static zzgpm zzaE(zzgpm zzgpmVar, zzgoe zzgoeVar) throws zzgpy {
        zzgoy zzgoyVar = zzgoy.zza;
        zzgom zzgomVarZzl = zzgoeVar.zzl();
        zzgpm zzgpmVarZzaD = zzgpmVar.zzaD();
        try {
            zzgrp zzgrpVarZzb = zzgre.zza().zzb(zzgpmVarZzaD.getClass());
            zzgrpVarZzb.zzh(zzgpmVarZzaD, zzgon.zzq(zzgomVarZzl), zzgoyVar);
            zzgrpVarZzb.zzf(zzgpmVarZzaD);
            try {
                zzgomVarZzl.zzz(0);
                zzc(zzgpmVarZzaD);
                zzc(zzgpmVarZzaD);
                return zzgpmVarZzaD;
            } catch (zzgpy e10) {
                e10.zzh(zzgpmVarZzaD);
                throw e10;
            }
        } catch (zzgpy e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgpy(e);
            }
            e.zzh(zzgpmVarZzaD);
            throw e;
        } catch (zzgsf e12) {
            zzgpy zzgpyVarZza = e12.zza();
            zzgpyVarZza.zzh(zzgpmVarZzaD);
            throw zzgpyVarZza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgpy) {
                throw ((zzgpy) e13.getCause());
            }
            zzgpy zzgpyVar = new zzgpy(e13);
            zzgpyVar.zzh(zzgpmVarZzaD);
            throw zzgpyVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgpy) {
                throw ((zzgpy) e14.getCause());
            }
            throw e14;
        }
    }

    public static zzgpm zzaF(zzgpm zzgpmVar, byte[] bArr) throws zzgpy {
        zzgpm zzgpmVarZzd = zzd(zzgpmVar, bArr, 0, bArr.length, zzgoy.zza);
        zzc(zzgpmVarZzd);
        return zzgpmVarZzd;
    }

    public static zzgpm zzaG(zzgpm zzgpmVar, zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        zzgom zzgomVarZzl = zzgoeVar.zzl();
        zzgpm zzgpmVarZzaD = zzgpmVar.zzaD();
        try {
            zzgrp zzgrpVarZzb = zzgre.zza().zzb(zzgpmVarZzaD.getClass());
            zzgrpVarZzb.zzh(zzgpmVarZzaD, zzgon.zzq(zzgomVarZzl), zzgoyVar);
            zzgrpVarZzb.zzf(zzgpmVarZzaD);
            try {
                zzgomVarZzl.zzz(0);
                zzc(zzgpmVarZzaD);
                return zzgpmVarZzaD;
            } catch (zzgpy e10) {
                e10.zzh(zzgpmVarZzaD);
                throw e10;
            }
        } catch (zzgpy e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgpy(e);
            }
            e.zzh(zzgpmVarZzaD);
            throw e;
        } catch (zzgsf e12) {
            zzgpy zzgpyVarZza = e12.zza();
            zzgpyVarZza.zzh(zzgpmVarZzaD);
            throw zzgpyVarZza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgpy) {
                throw ((zzgpy) e13.getCause());
            }
            zzgpy zzgpyVar = new zzgpy(e13);
            zzgpyVar.zzh(zzgpmVarZzaD);
            throw zzgpyVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgpy) {
                throw ((zzgpy) e14.getCause());
            }
            throw e14;
        }
    }

    public static zzgpm zzaH(zzgpm zzgpmVar, InputStream inputStream, zzgoy zzgoyVar) throws zzgpy {
        zzgom zzgomVarZzH = zzgom.zzH(inputStream, 4096);
        zzgpm zzgpmVarZzaD = zzgpmVar.zzaD();
        try {
            zzgrp zzgrpVarZzb = zzgre.zza().zzb(zzgpmVarZzaD.getClass());
            zzgrpVarZzb.zzh(zzgpmVarZzaD, zzgon.zzq(zzgomVarZzH), zzgoyVar);
            zzgrpVarZzb.zzf(zzgpmVarZzaD);
            zzc(zzgpmVarZzaD);
            return zzgpmVarZzaD;
        } catch (zzgpy e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgpy(e);
            }
            e.zzh(zzgpmVarZzaD);
            throw e;
        } catch (zzgsf e11) {
            zzgpy zzgpyVarZza = e11.zza();
            zzgpyVarZza.zzh(zzgpmVarZzaD);
            throw zzgpyVarZza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgpy) {
                throw ((zzgpy) e12.getCause());
            }
            zzgpy zzgpyVar = new zzgpy(e12);
            zzgpyVar.zzh(zzgpmVarZzaD);
            throw zzgpyVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgpy) {
                throw ((zzgpy) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzgpm zzaI(zzgpm zzgpmVar, byte[] bArr, zzgoy zzgoyVar) throws zzgpy {
        zzgpm zzgpmVarZzd = zzd(zzgpmVar, bArr, 0, bArr.length, zzgoyVar);
        zzc(zzgpmVarZzd);
        return zzgpmVarZzd;
    }

    public static zzgpr zzaJ() {
        return zzgpn.zzf();
    }

    public static zzgpr zzaK(zzgpr zzgprVar) {
        int size = zzgprVar.size();
        return zzgprVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzgpu zzaL() {
        return zzgql.zzf();
    }

    public static zzgpu zzaM(zzgpu zzgpuVar) {
        int size = zzgpuVar.size();
        return zzgpuVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzgpv zzaN() {
        return zzgrf.zze();
    }

    public static zzgpv zzaO(zzgpv zzgpvVar) {
        int size = zzgpvVar.size();
        return zzgpvVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzaR(zzgqw zzgqwVar, String str, Object[] objArr) {
        return new zzgrg(zzgqwVar, str, objArr);
    }

    public static void zzaU(Class cls, zzgpm zzgpmVar) {
        zzgpmVar.zzaT();
        zzb.put(cls, zzgpmVar);
    }

    private static zzgpm zzc(zzgpm zzgpmVar) throws zzgpy {
        if (zzgpmVar == null || zzgpmVar.zzaX()) {
            return zzgpmVar;
        }
        zzgpy zzgpyVarZza = new zzgsf(zzgpmVar).zza();
        zzgpyVarZza.zzh(zzgpmVar);
        throw zzgpyVarZza;
    }

    private static zzgpm zzd(zzgpm zzgpmVar, byte[] bArr, int i10, int i11, zzgoy zzgoyVar) throws zzgpy {
        zzgpm zzgpmVarZzaD = zzgpmVar.zzaD();
        try {
            zzgrp zzgrpVarZzb = zzgre.zza().zzb(zzgpmVarZzaD.getClass());
            zzgrpVarZzb.zzi(zzgpmVarZzaD, bArr, 0, i11, new zzgnq(zzgoyVar));
            zzgrpVarZzb.zzf(zzgpmVarZzaD);
            return zzgpmVarZzaD;
        } catch (zzgpy e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgpy(e);
            }
            e.zzh(zzgpmVarZzaD);
            throw e;
        } catch (zzgsf e11) {
            zzgpy zzgpyVarZza = e11.zza();
            zzgpyVarZza.zzh(zzgpmVarZzaD);
            throw zzgpyVarZza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgpy) {
                throw ((zzgpy) e12.getCause());
            }
            zzgpy zzgpyVar = new zzgpy(e12);
            zzgpyVar.zzh(zzgpmVarZzaD);
            throw zzgpyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgpy zzgpyVarZzj = zzgpy.zzj();
            zzgpyVarZzj.zzh(zzgpmVarZzaD);
            throw zzgpyVarZzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgre.zza().zzb(getClass()).zzj(this, (zzgpm) obj);
    }

    public final int hashCode() {
        if (zzaY()) {
            return zzay();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzay = zzay();
        this.zza = iZzay;
        return iZzay;
    }

    public final String toString() {
        return zzgqy.zza(this, super.toString());
    }

    public final zzgpi zzaA() {
        return (zzgpi) zzb(5, null, null);
    }

    public final zzgpi zzaB() {
        zzgpi zzgpiVar = (zzgpi) zzb(5, null, null);
        zzgpiVar.zzaj(this);
        return zzgpiVar;
    }

    public final zzgpm zzaD() {
        return (zzgpm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final /* synthetic */ zzgqv zzaP() {
        return (zzgpi) zzb(5, null, null);
    }

    public final void zzaS() {
        zzgre.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    public final void zzaT() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzaV(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final void zzaW(zzgot zzgotVar) throws IOException {
        zzgre.zza().zzb(getClass()).zzm(this, zzgou.zza(zzgotVar));
    }

    public final boolean zzaX() {
        byte bByteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzgre.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zZzk ? null : this, null);
        return zZzk;
    }

    final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzat(zzgrp zzgrpVar) {
        if (zzaY()) {
            int iZza = zzgrpVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(android.support.v4.media.a.a("serialized size must be non-negative, was ", iZza));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzgrpVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(android.support.v4.media.a.a("serialized size must be non-negative, was ", iZza2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    public final int zzay() {
        return zzgre.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final int zzaz() {
        int iZza;
        if (zzaY()) {
            iZza = zza(null);
            if (iZza < 0) {
                throw new IllegalStateException(android.support.v4.media.a.a("serialized size must be non-negative, was ", iZza));
            }
        } else {
            iZza = this.zzd & Integer.MAX_VALUE;
            if (iZza == Integer.MAX_VALUE) {
                iZza = zza(null);
                if (iZza < 0) {
                    throw new IllegalStateException(android.support.v4.media.a.a("serialized size must be non-negative, was ", iZza));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza;
            }
        }
        return iZza;
    }

    public abstract Object zzb(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final /* synthetic */ zzgqw zzbf() {
        return (zzgpm) zzb(6, null, null);
    }
}
