package t5;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class h implements q5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35702a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35703b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q5.d f35704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f35705d;

    public h(f fVar) {
        this.f35705d = fVar;
    }

    @Override // q5.h
    public q5.h e(String str) throws IOException {
        if (this.f35702a) {
            throw new q5.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f35702a = true;
        this.f35705d.e(this.f35704c, str, this.f35703b);
        return this;
    }

    @Override // q5.h
    public q5.h f(boolean z10) throws IOException {
        if (this.f35702a) {
            throw new q5.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f35702a = true;
        this.f35705d.f(this.f35704c, z10 ? 1 : 0, this.f35703b);
        return this;
    }
}
