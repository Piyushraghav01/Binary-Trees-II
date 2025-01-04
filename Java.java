// build tree
/*
 class BinaryTreeNode:
    def __init__(self,data):
        self.data=data;
        self.left=None
        self.right=None

def printTree(root):
    if root==None:
        return
    print(root.data)
    printTree(root.left)
    printTree(root.right)

def printTreeDetailed(root):
    if root==None:
        return
    print(root.data,end=":")
    if root.left!=None:
        print("L",root.left.data,end=",")
    if root.right!=None:
        print("R",root.right.data,end="")
    print()
    printTreeDetailed(root.left)
    printTreeDetailed(root.right)

def buildTreeFromPreIn(pre,inorder):
    if len(pre)==0:
        return None
    rootData=pre[0]
    root=BinaryTreeNode(rootData)
    rootIndexInInOrder=-1
    for i in range(0,len(inorder)):
        if inorder[i]==rootData:
            rootIndexInInorder=i
            break
    if rootIndexInInorder==-1:
        return None
        
    leftInorder=inorder[0:rootIndexInInorder]
    rightInorder=inorder[rootIndexInInorder+1:]
        
    lenLeftSubtree=len(leftInorder)
        
    leftPreorder=pre[1:lenLeftSubtree+1]
    rightPreorder=pre[lenLeftSubtree+1:]
        
    leftChild=buildTreeFromPreIn(leftPreorder,leftInorder)
    rightChild=buildTreeFromPreIn(rightPreorder,rightInorder)
        
    root.left=leftChild
    root.right=rightChild
    return root

pre=[1,2,4,5,3,6,7]
inorder=[4,2,5,1,6,3,7]
root=buildTreeFromPreIn(pre,inorder)
printTreeDetailed(root)
 */