package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaqp implements zzaqo {
    public static volatile zzart zza;
    public MotionEvent zzb;
    public double zzk;
    public float zzl;
    public float zzm;
    public float zzn;
    public float zzo;
    public DisplayMetrics zzq;
    public zzarl zzr;
    private double zzs;
    private double zzt;
    public final LinkedList zzc = new LinkedList();
    public long zzd = 0;
    public long zze = 0;
    public long zzf = 0;
    public long zzg = 0;
    public long zzh = 0;
    public long zzi = 0;
    public long zzj = 0;
    private boolean zzu = false;
    public boolean zzp = false;

    public zzaqp(Context context) {
        try {
            zzaph.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcr)).booleanValue()) {
                this.zzr = new zzarl();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzm(Context context, String str, int i10, View view, Activity activity, byte[] bArr) {
        zzaqn zzaqnVarZzd;
        String str2;
        int i11;
        Exception exc;
        int i12;
        int i13;
        long jCurrentTimeMillis;
        String strZza;
        int i14;
        int i15;
        zzanq zzanqVarZzc;
        int i16;
        int i17;
        int i18 = i10;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcj)).booleanValue();
        zzanq zzanqVarZzb = null;
        if (zBooleanValue) {
            zzaqnVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzaqnVarZzd = null;
            str2 = null;
        }
        int i19 = 1;
        try {
            if (i18 == 3) {
                zzanqVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i17 = 1002;
                } catch (Exception e10) {
                    exc = e10;
                    i11 = 3;
                    i19 = 1;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzanqVarZzb != null) {
                        try {
                            if (((zzaon) zzanqVarZzb.zzal()).zzaz() == 0) {
                                strZza = Integer.toString(5);
                            } else {
                                zzaon zzaonVar = (zzaon) zzanqVarZzb.zzal();
                                int i20 = zzaph.zzc;
                                strZza = zzaph.zza(zzaonVar.zzax(), str);
                                if (zBooleanValue) {
                                    if (i18 == i11) {
                                        i14 = 1006;
                                    } else if (i18 == i12) {
                                        i14 = 1010;
                                    } else {
                                        i14 = 1004;
                                    }
                                    zzaqnVarZzd.zzc(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e11) {
                            strZza = Integer.toString(7);
                            if (zBooleanValue && zzaqnVarZzd != null) {
                                if (i18 == i11) {
                                    i15 = 1007;
                                } else {
                                    i15 = i18 == i12 ? 1011 : WebSocketProtocol.CLOSE_NO_STATUS_CODE;
                                }
                                zzaqnVarZzd.zzc(i15, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e11);
                            }
                        }
                    } else {
                        strZza = Integer.toString(5);
                    }
                    return strZza;
                }
            } else {
                if (i18 == 2) {
                    zzanqVarZzc = zzd(context, view, activity);
                    i16 = 1008;
                } else {
                    zzanqVarZzc = zzc(context, null);
                    i16 = 1000;
                }
                zzanqVarZzb = zzanqVarZzc;
                i17 = i16;
            }
            if (!zBooleanValue || zzaqnVarZzd == null) {
                i11 = 3;
            } else {
                i11 = 3;
                try {
                    zzaqnVarZzd.zzc(i17, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    if (!zBooleanValue && zzaqnVarZzd != null) {
                        if (i18 == i11) {
                            i13 = 1003;
                            i12 = 2;
                        } else {
                            i12 = 2;
                            if (i18 == 2) {
                                i13 = 1009;
                            } else {
                                i13 = 1001;
                                i18 = i19;
                            }
                        }
                        zzaqnVarZzd.zzc(i13, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzanqVarZzb != null) {
                        strZza = Integer.toString(5);
                    } else if (((zzaon) zzanqVarZzb.zzal()).zzaz() == 0) {
                        strZza = Integer.toString(5);
                    } else {
                        zzaon zzaonVar2 = (zzaon) zzanqVarZzb.zzal();
                        int i21 = zzaph.zzc;
                        strZza = zzaph.zza(zzaonVar2.zzax(), str);
                        if (zBooleanValue) {
                            if (i18 == i11) {
                                i14 = 1006;
                            } else if (i18 == i12) {
                                i14 = 1010;
                            } else {
                                i14 = 1004;
                            }
                            zzaqnVarZzd.zzc(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZza;
                }
            }
        } catch (Exception e13) {
            e = e13;
            i11 = 3;
        }
        i12 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzanqVarZzb != null) {
            strZza = Integer.toString(5);
        } else if (((zzaon) zzanqVarZzb.zzal()).zzaz() == 0) {
            strZza = Integer.toString(5);
        } else {
            zzaon zzaonVar3 = (zzaon) zzanqVarZzb.zzal();
            int i22 = zzaph.zzc;
            strZza = zzaph.zza(zzaonVar3.zzax(), str);
            if (zBooleanValue && zzaqnVarZzd != null) {
                if (i18 == i11) {
                    i14 = 1006;
                } else if (i18 == i12) {
                    i14 = 1010;
                } else {
                    i14 = 1004;
                }
                zzaqnVarZzd.zzc(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZza;
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzarj;

    public abstract zzanq zzb(Context context, View view, Activity activity);

    public abstract zzanq zzc(Context context, zzanj zzanjVar);

    public abstract zzanq zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzg(Context context) {
        if (zzarw.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    public abstract zzarv zzi(MotionEvent motionEvent) throws zzarj;

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d10 = rawX - this.zzs;
            double d11 = rawY - this.zzt;
            this.zzk += Math.sqrt((d11 * d11) + (d10 * d10));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    this.zzc.add(motionEventObtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += (long) (motionEvent.getHistorySize() + 1);
                    zzarv zzarvVarZzi = zzi(motionEvent);
                    Long l11 = zzarvVarZzi.zzd;
                    if (l11 != null && zzarvVarZzi.zzg != null) {
                        this.zzi = l11.longValue() + zzarvVarZzi.zzg.longValue() + this.zzi;
                    }
                    if (this.zzq != null && (l10 = zzarvVarZzi.zze) != null && zzarvVarZzi.zzh != null) {
                        this.zzj = l10.longValue() + zzarvVarZzi.zzh.longValue() + this.zzj;
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzarj unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzl(int i10, int i11, int i12) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzch)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarl zzarlVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcr)).booleanValue() || (zzarlVar = this.zzr) == null) {
            return;
        }
        zzarlVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public void zzo(View view) {
    }
}
