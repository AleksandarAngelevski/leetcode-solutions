






































// Prvo Reshenie 
// class ListNode {      int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }

  

//   class AddTwoNumbers {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode curr=l1;
//         ListNode curr2=l2;
//         int v1=0;
//         int v2=0;
//         int carry=0;
//         int calc=0;
//         while(true){
//             v1=curr.val;
//             v2=curr2.val;
//             if(curr.next == null &&curr2.next==null){
//                 if((v1+v2+carry)<10){
//                     curr.val=v1+v2+carry;
//                     carry=0;
//                     break;
//                 }
//                 else if((v1+v2+carry)>=10){
//                     curr.val=(v1+v2+carry)%10;
//                     carry=1;
//                     curr.next = new ListNode(0);
//                     curr2.next = new ListNode(0);
//                 }
//                 else if(carry<10){
//                     curr.next = new ListNode(carry);
//                     break;
//                 }
//                 curr=curr.next;
//                 curr2=curr2.next;
//             }
//             else if(curr.next==null){
//                 if((v1+v2+carry)<10){
//                     curr.val=v1+v2+carry;
//                     carry=0;
//                 }
//                 else{
//                     curr.val=(v1+v2+carry)%10;
//                     carry=1;
//                 }
//                 curr.next = new ListNode(0);
//                 curr=curr.next;
//                 curr2=curr2.next;
//             }
//             else if(curr2.next==null){
//                 if((v1+v2+carry)<10){
//                     curr.val=v1+v2+carry;
//                     carry=0;
//                 }
//                 else{
//                     curr.val=(v1+v2+carry)%10;
//                     carry=1;
//                 }
//                 curr2.next = new ListNode(0);
//                 curr=curr.next;
//                 curr2=curr2.next;
//             }
//             else{
//                 calc =v1+v2+carry;
//                 if(calc>=10){
//                     curr.val=calc%10;
//                     carry=1;
//                 }
//                 else{
//                     curr.val=calc;
//                     carry=0;
//                 }
//                 curr=curr.next;
//                 curr2=curr2.next;
//             }
//         }
        
//         return l1;
//     }
    
// }

