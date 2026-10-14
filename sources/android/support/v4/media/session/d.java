package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d<T extends c> extends MediaController.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f450a;

    public d(T t10) {
        this.f450a = t10;
    }

    @Override // android.media.session.MediaController.Callback
    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        T t10 = this.f450a;
        playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if ((audioAttributes.getFlags() & 1) != 1 && (audioAttributes.getFlags() & 4) != 4) {
            audioAttributes.getUsage();
        }
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        ((MediaControllerCompat.a.C0015a) t10).f404a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((MediaControllerCompat.a.C0015a) this.f450a).f404a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((MediaControllerCompat.a.C0015a) this.f450a).f404a.get() != null) {
            Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                Objects.requireNonNull(mediaMetadataCompatCreateFromParcel);
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        MediaControllerCompat.a aVar = ((MediaControllerCompat.a.C0015a) this.f450a).f404a.get();
        if (aVar == null || aVar.f403a != null || playbackState == null) {
            return;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction2 : customActions) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    customAction = new PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), customAction3.getExtras());
                    customAction.f447g = customAction2;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), playbackState.getExtras());
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueChanged(List<MediaSession.QueueItem> list) {
        MediaSessionCompat.QueueItem queueItem;
        if (((MediaControllerCompat.a.C0015a) this.f450a).f404a.get() == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaSession.QueueItem queueItem2 : list) {
            if (queueItem2 != null) {
                MediaSession.QueueItem queueItem3 = queueItem2;
                queueItem = new MediaSessionCompat.QueueItem(queueItem2, MediaDescriptionCompat.a(queueItem3.getDescription()), queueItem3.getQueueId());
            } else {
                queueItem = null;
            }
            arrayList.add(queueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueTitleChanged(CharSequence charSequence) {
        ((MediaControllerCompat.a.C0015a) this.f450a).f404a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionDestroyed() {
        ((MediaControllerCompat.a.C0015a) this.f450a).f404a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((MediaControllerCompat.a.C0015a) this.f450a).f404a.get();
    }
}
