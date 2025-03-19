class Node:
    def __init__(self,data):
        self.item=data
        self.next=None
        self.prev=None
    def insertEnd(value):
        global start
        if(start==None):
            new_node=None(0)
            new_node.data=value
            new_node.next=new_node.prev=new_node
            start=new-node
            return
        last=(start).prev
        new_node=node(0)
        new_node.data=value
        new_node.next=start
        (start).prev=new_node
        new_node.prev=last
        last.next=new_node
    def insertBegin(value):
        global start
        last=(start).prev
        new_node=Node(0)
        new_node.data=value
        new_node.next=start
        new_node.prev=last
        last.next=(start).prev=new_node
        
            



                  
