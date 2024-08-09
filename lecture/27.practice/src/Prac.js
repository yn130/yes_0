import React, {useState} from 'react'

export default function Prac() {

    const [inputs, setInputs] = useState({
        username: '',
        email: ''
    });

    const { username, email } = inputs

    const onChange = (e) => { 
        const { name, value } = e.target;    
        setInputs({
             ...inputs,
             [name]: value 
         }); 
    }; 


    const nextId = users(4);;  
    const onCreate = () => {
        const user = {
            id: nextId.current,
            username,
            email    
        };    
    
        setUsers(users.concat(user));  // concat함수를 이용해서 불변성을 지킴     
        setInputs({      
            username: '',     
            email: ''    
        });   
        
        nextId.current += 1;
    };


  return (
    <div>
        <input type="text" placeholder='이름' value = {username} onChange = {onChange}/>
        <input type="email" placeholder='이메일' value = {email} onChange = {onChange}/>
        <button onClick={onCreate}>등록</button>

        <div>{users}</div>

    </div>
  )
}

<>      
{/* <CreateUser
    username={username}  
    email={email}        
    onChange={onChange}        
    onCreate={onCreate}    
/>     
<UserList users={users} />    */}
 </>  
//  );}

