package z0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.activity.i;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44989a;

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f44990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f44991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f44992c = true;

        public a(TextView textView) {
            this.f44990a = textView;
            this.f44991b = new d(textView);
        }

        @Override // z0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (this.f44992c) {
                int length = inputFilterArr.length;
                for (InputFilter inputFilter : inputFilterArr) {
                    if (inputFilter == this.f44991b) {
                        return inputFilterArr;
                    }
                }
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = this.f44991b;
                return inputFilterArr2;
            }
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length2; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr3[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr3;
        }

        @Override // z0.f.b
        public boolean b() {
            return this.f44992c;
        }

        @Override // z0.f.b
        public void c(boolean z10) {
            if (z10) {
                this.f44990a.setTransformationMethod(e(this.f44990a.getTransformationMethod()));
            }
        }

        @Override // z0.f.b
        public void d(boolean z10) {
            this.f44992c = z10;
            this.f44990a.setTransformationMethod(e(this.f44990a.getTransformationMethod()));
            this.f44990a.setFilters(a(this.f44990a.getFilters()));
        }

        @Override // z0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f44992c) {
                return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
            }
            return transformationMethod instanceof h ? ((h) transformationMethod).f44999c : transformationMethod;
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f44993a;

        public c(TextView textView) {
            this.f44993a = new a(textView);
        }

        @Override // z0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f44993a.a(inputFilterArr);
        }

        @Override // z0.f.b
        public boolean b() {
            return this.f44993a.f44992c;
        }

        @Override // z0.f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            a aVar = this.f44993a;
            Objects.requireNonNull(aVar);
            if (z10) {
                aVar.f44990a.setTransformationMethod(aVar.e(aVar.f44990a.getTransformationMethod()));
            }
        }

        @Override // z0.f.b
        public void d(boolean z10) {
            if (f()) {
                this.f44993a.f44992c = z10;
            } else {
                this.f44993a.d(z10);
            }
        }

        @Override // z0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f44993a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.e.c();
        }
    }

    public f(TextView textView) {
        this(textView, true);
    }

    public f(TextView textView, boolean z10) {
        i.f(textView, "textView cannot be null");
        this.f44989a = !z10 ? new c(textView) : new a(textView);
    }
}
