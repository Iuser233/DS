
	public class BinaryTreeNode {
		private Object data;
		BinaryTreeNode lChild;
		BinaryTreeNode rChild;

		public BinaryTreeNode() {
			data = -1;
			lChild = null;
			rChild = null;
		}
		
		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public BinaryTreeNode(Object x) {
			data = x;
			lChild = null;
			rChild = null;
		}

		public BinaryTreeNode(Object data, BinaryTreeNode lChild, BinaryTreeNode rChild) {
			super();
			this.data = data;
			this.lChild = lChild;
			this.rChild = rChild;
		}

	}
