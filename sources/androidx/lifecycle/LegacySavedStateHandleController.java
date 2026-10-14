package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LegacySavedStateHandleController {

    public static final class a implements m1.b.a {
        @Override // m1.b.a
        public void a(m1.d dVar) {
            if (!(dVar instanceof o0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            n0 viewModelStore = ((o0) dVar).getViewModelStore();
            m1.b savedStateRegistry = dVar.getSavedStateRegistry();
            Objects.requireNonNull(viewModelStore);
            Iterator it = new HashSet(viewModelStore.f2242a.keySet()).iterator();
            while (it.hasNext()) {
                l0 l0Var = viewModelStore.f2242a.get((String) it.next());
                i lifecycle = dVar.getLifecycle();
                SavedStateHandleController savedStateHandleController = (SavedStateHandleController) l0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
                if (savedStateHandleController != null && !savedStateHandleController.f2158d) {
                    savedStateHandleController.h(savedStateRegistry, lifecycle);
                    LegacySavedStateHandleController.a(savedStateRegistry, lifecycle);
                }
            }
            if (new HashSet(viewModelStore.f2242a.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    public static void a(final m1.b bVar, final i iVar) {
        i.c cVarB = iVar.b();
        if (cVarB == i.c.INITIALIZED || cVarB.isAtLeast(i.c.STARTED)) {
            bVar.d(a.class);
        } else {
            iVar.a(new n() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.n
                public void g(p pVar, i.b bVar2) {
                    if (bVar2 == i.b.ON_START) {
                        iVar.c(this);
                        bVar.d(a.class);
                    }
                }
            });
        }
    }
}
