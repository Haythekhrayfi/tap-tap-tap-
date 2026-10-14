package ab;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import fd.j0;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelaunchPremiumActivity f327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j10, RelaunchPremiumActivity relaunchPremiumActivity) {
        super(j10, 1000L);
        this.f327a = relaunchPremiumActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f327a.finish();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        RelaunchPremiumActivity relaunchPremiumActivity = this.f327a;
        TextView textView = relaunchPremiumActivity.f28377h;
        if (textView == null) {
            return;
        }
        Objects.requireNonNull(relaunchPremiumActivity);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j11 = 60;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10) % ((long) 24)), Long.valueOf(timeUnit.toMinutes(j10) % j11), Long.valueOf(timeUnit.toSeconds(j10) % j11)}, 3));
        j0.h(str, "format(format, *args)");
        textView.setText(str);
    }
}
