package interfaces.examples.e11;

public class NestingInterfaces {
    public class BImp implements A.B{
        public void f(){}
    }
    class CImp implements A.C{
        //@Override
        public void f() {

        }
    }

    class EImp implements E{
        @Override
        public void g() {

        }
    }

    class EGImp implements E.G{
        @Override
        public void f() {

        }
    }

    class EImp2 implements E{
        @Override
        public void g() {

        }
        class EG implements E.G{
            @Override
            public void f() {

            }
        }
    }
}
