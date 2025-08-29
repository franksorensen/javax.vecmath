module javax.vecmath {

	exports javax.vecmath;

	requires org.junit.jupiter.api;
    opens javax.vecmath to junit;
}