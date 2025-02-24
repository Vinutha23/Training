
import { useEffect, useState } from 'react';
import axios from 'axios';

function Users() {
    const [users, setUsers] = useState([]);

    const fetchData = async () => {
        try {
            const resp = await axios.get('https://dummyjson.com/users');
            console.log(resp);
            setUsers(resp.data.users); // Ensure this matches the structure of the API response
        } catch (error) {
            console.log(error);
        }
    };

    // This effect will execute only once when the component loads
    //Delete and trigger API
    const deleteUser=async(id)=>{
        try{

            const resp=await axios.get(`http://localhost:5173/users'${id}`);
            if(resp.status===200)
            {
                alert('user created successfully');
                setUsers(users.filter(user=>user.id!==id));
            }
        }
        catch(error){

        }
    }
    useEffect(() => {
        fetchData();
    }, []);

    return (
        <div>
            <h3>User's List</h3> 
            <table className="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>Operations</th>
                    </tr>
                </thead>
                <tbody>
                    {Array.isArray(users) && users.map(user => (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.firstName} {user.lastName}</td>
                            <td>{user.email}</td>
                            <td>
                                <button className="btn btn-danger" onClick={()=>deleteUser(user.id)}>X</button>
                            </td>
                            <td>
                                {user.address.address}, {user.address.city}, {user.address.state}, {user.address.country}
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default Users;
