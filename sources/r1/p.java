package r1;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<l> f35122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35126g;

    public class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f35127a;

        public a(p pVar, l lVar) {
            this.f35127a = lVar;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(l lVar) {
            this.f35127a.runAnimators();
            lVar.removeListener(this);
        }
    }

    public static class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f35128a;

        public b(p pVar) {
            this.f35128a = pVar;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(l lVar) {
            p pVar = this.f35128a;
            int i10 = pVar.f35124e - 1;
            pVar.f35124e = i10;
            if (i10 == 0) {
                pVar.f35125f = false;
                pVar.end();
            }
            lVar.removeListener(this);
        }

        @Override // r1.m, r1.l.g
        public void onTransitionStart(l lVar) {
            p pVar = this.f35128a;
            if (pVar.f35125f) {
                return;
            }
            pVar.start();
            this.f35128a.f35125f = true;
        }
    }

    public p() {
        this.f35122c = new ArrayList<>();
        this.f35123d = true;
        this.f35125f = false;
        this.f35126g = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35122c = new ArrayList<>();
        this.f35123d = true;
        this.f35125f = false;
        this.f35126g = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35104e);
        g(g0.j.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // r1.l
    public l addListener(l.g gVar) {
        return (p) super.addListener(gVar);
    }

    @Override // r1.l
    public l addTarget(int i10) {
        for (int i11 = 0; i11 < this.f35122c.size(); i11++) {
            this.f35122c.get(i11).addTarget(i10);
        }
        return (p) super.addTarget(i10);
    }

    public p b(l lVar) {
        this.f35122c.add(lVar);
        lVar.mParent = this;
        long j10 = this.mDuration;
        if (j10 >= 0) {
            lVar.setDuration(j10);
        }
        if ((this.f35126g & 1) != 0) {
            lVar.setInterpolator(getInterpolator());
        }
        if ((this.f35126g & 2) != 0) {
            lVar.setPropagation(getPropagation());
        }
        if ((this.f35126g & 4) != 0) {
            lVar.setPathMotion(getPathMotion());
        }
        if ((this.f35126g & 8) != 0) {
            lVar.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    public l c(int i10) {
        if (i10 < 0 || i10 >= this.f35122c.size()) {
            return null;
        }
        return this.f35122c.get(i10);
    }

    @Override // r1.l
    public void cancel() {
        super.cancel();
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).cancel();
        }
    }

    @Override // r1.l
    public void captureEndValues(r rVar) {
        if (isValidTarget(rVar.f35133b)) {
            for (l lVar : this.f35122c) {
                if (lVar.isValidTarget(rVar.f35133b)) {
                    lVar.captureEndValues(rVar);
                    rVar.f35134c.add(lVar);
                }
            }
        }
    }

    @Override // r1.l
    public void capturePropagationValues(r rVar) {
        super.capturePropagationValues(rVar);
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).capturePropagationValues(rVar);
        }
    }

    @Override // r1.l
    public void captureStartValues(r rVar) {
        if (isValidTarget(rVar.f35133b)) {
            for (l lVar : this.f35122c) {
                if (lVar.isValidTarget(rVar.f35133b)) {
                    lVar.captureStartValues(rVar);
                    rVar.f35134c.add(lVar);
                }
            }
        }
    }

    @Override // r1.l
    public l clone() {
        p pVar = (p) super.clone();
        pVar.f35122c = new ArrayList<>();
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVarClone = this.f35122c.get(i10).clone();
            pVar.f35122c.add(lVarClone);
            lVarClone.mParent = pVar;
        }
        return pVar;
    }

    @Override // r1.l
    public void createAnimators(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = this.f35122c.get(i10);
            if (startDelay > 0 && (this.f35123d || i10 == 0)) {
                long startDelay2 = lVar.getStartDelay();
                if (startDelay2 > 0) {
                    lVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    lVar.setStartDelay(startDelay);
                }
            }
            lVar.createAnimators(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    public int d() {
        return this.f35122c.size();
    }

    public p e(long j10) {
        ArrayList<l> arrayList;
        super.setDuration(j10);
        if (this.mDuration >= 0 && (arrayList = this.f35122c) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f35122c.get(i10).setDuration(j10);
            }
        }
        return this;
    }

    @Override // r1.l
    public l excludeTarget(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f35122c.size(); i11++) {
            this.f35122c.get(i11).excludeTarget(i10, z10);
        }
        return super.excludeTarget(i10, z10);
    }

    @Override // r1.l
    public l excludeTarget(View view, boolean z10) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).excludeTarget(view, z10);
        }
        return super.excludeTarget(view, z10);
    }

    @Override // r1.l
    public l excludeTarget(Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).excludeTarget(cls, z10);
        }
        return super.excludeTarget(cls, z10);
    }

    @Override // r1.l
    public l excludeTarget(String str, boolean z10) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).excludeTarget(str, z10);
        }
        return super.excludeTarget(str, z10);
    }

    @Override // r1.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p setInterpolator(TimeInterpolator timeInterpolator) {
        this.f35126g |= 1;
        ArrayList<l> arrayList = this.f35122c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f35122c.get(i10).setInterpolator(timeInterpolator);
            }
        }
        return (p) super.setInterpolator(timeInterpolator);
    }

    @Override // r1.l
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).forceToEnd(viewGroup);
        }
    }

    public p g(int i10) {
        if (i10 == 0) {
            this.f35123d = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(android.support.v4.media.a.a("Invalid parameter for TransitionSet ordering: ", i10));
            }
            this.f35123d = false;
        }
        return this;
    }

    @Override // r1.l
    public void pause(View view) {
        super.pause(view);
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).pause(view);
        }
    }

    @Override // r1.l
    public l removeListener(l.g gVar) {
        return (p) super.removeListener(gVar);
    }

    @Override // r1.l
    public l removeTarget(int i10) {
        for (int i11 = 0; i11 < this.f35122c.size(); i11++) {
            this.f35122c.get(i11).removeTarget(i10);
        }
        return (p) super.removeTarget(i10);
    }

    @Override // r1.l
    public void resume(View view) {
        super.resume(view);
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).resume(view);
        }
    }

    @Override // r1.l
    public void runAnimators() {
        if (this.f35122c.isEmpty()) {
            start();
            end();
            return;
        }
        b bVar = new b(this);
        Iterator<l> it = this.f35122c.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.f35124e = this.f35122c.size();
        if (this.f35123d) {
            Iterator<l> it2 = this.f35122c.iterator();
            while (it2.hasNext()) {
                it2.next().runAnimators();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10 - 1).addListener(new a(this, this.f35122c.get(i10)));
        }
        l lVar = this.f35122c.get(0);
        if (lVar != null) {
            lVar.runAnimators();
        }
    }

    @Override // r1.l
    public void setCanRemoveViews(boolean z10) {
        super.setCanRemoveViews(z10);
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).setCanRemoveViews(z10);
        }
    }

    @Override // r1.l
    public /* bridge */ /* synthetic */ l setDuration(long j10) {
        e(j10);
        return this;
    }

    @Override // r1.l
    public void setEpicenterCallback(l.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f35126g |= 8;
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).setEpicenterCallback(fVar);
        }
    }

    @Override // r1.l
    public void setPathMotion(g gVar) {
        super.setPathMotion(gVar);
        this.f35126g |= 4;
        if (this.f35122c != null) {
            for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
                this.f35122c.get(i10).setPathMotion(gVar);
            }
        }
    }

    @Override // r1.l
    public void setPropagation(o oVar) {
        super.setPropagation(oVar);
        this.f35126g |= 2;
        int size = this.f35122c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35122c.get(i10).setPropagation(oVar);
        }
    }

    @Override // r1.l
    public l setStartDelay(long j10) {
        return (p) super.setStartDelay(j10);
    }

    @Override // r1.l
    public String toString(String str) {
        String string = super.toString(str);
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            StringBuilder sbA = android.support.v4.media.c.a(string, "\n");
            sbA.append(this.f35122c.get(i10).toString(str + "  "));
            string = sbA.toString();
        }
        return string;
    }

    @Override // r1.l
    public l addTarget(View view) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).addTarget(view);
        }
        return (p) super.addTarget(view);
    }

    @Override // r1.l
    public l removeTarget(View view) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).removeTarget(view);
        }
        return (p) super.removeTarget(view);
    }

    @Override // r1.l
    public l addTarget(Class cls) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).addTarget((Class<?>) cls);
        }
        return (p) super.addTarget((Class<?>) cls);
    }

    @Override // r1.l
    public l removeTarget(Class cls) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).removeTarget((Class<?>) cls);
        }
        return (p) super.removeTarget((Class<?>) cls);
    }

    @Override // r1.l
    public l addTarget(String str) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).addTarget(str);
        }
        return (p) super.addTarget(str);
    }

    @Override // r1.l
    public l removeTarget(String str) {
        for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
            this.f35122c.get(i10).removeTarget(str);
        }
        return (p) super.removeTarget(str);
    }
}
