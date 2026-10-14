package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
public final class VideoController {

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;

    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;

    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzdq zzb;
    private VideoLifecycleCallbacks zzc;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar == null) {
                return 0;
            }
            try {
                return zzdqVar.zzh();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.zza) {
            z10 = this.zzb != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzo();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzp();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar == null) {
                return true;
            }
            try {
                return zzdqVar.zzq();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzj(z10);
                } catch (RemoteException e10) {
                    zzbzr.zzh("Unable to call mute on video controller.", e10);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzk();
                } catch (RemoteException e10) {
                    zzbzr.zzh("Unable to call pause on video controller.", e10);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzl();
                } catch (RemoteException e10) {
                    zzbzr.zzh("Unable to call play on video controller.", e10);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfk zzfkVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfkVar = null;
                } else {
                    try {
                        zzfkVar = new zzfk(videoLifecycleCallbacks);
                    } catch (RemoteException e10) {
                        zzbzr.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                    }
                }
                zzdqVar.zzm(zzfkVar);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzn();
                } catch (RemoteException e10) {
                    zzbzr.zzh("Unable to call stop on video controller.", e10);
                }
            }
        }
    }

    public final zzdq zza() {
        zzdq zzdqVar;
        synchronized (this.zza) {
            zzdqVar = this.zzb;
        }
        return zzdqVar;
    }

    public final void zzb(zzdq zzdqVar) {
        synchronized (this.zza) {
            this.zzb = zzdqVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
