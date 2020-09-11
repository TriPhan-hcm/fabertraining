/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

<script>
        function sumPerson(){
            var x = parseInt(document.getElementById("adultNumber").value) + parseInt(document.getElementById("childNumber").value) + parseInt(document.getElementById("seniorNumber").value);
            document.getElementById("demo").innerHTML = x;
            var now = new Date();
            var datetimeNow = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate() + ' ' + today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
            
           document.getElementById("demo").innerHTML = datetimeNow;
        }
</script>
