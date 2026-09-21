A way to store data, and have it be accessible to components no matter where they are in your tree, without having to use props.

1. Import `createContext` and `useContext` from React
``` jsx
import { createContext, useContext } from 'react';
```
2. Import the data you want to store
``` jsx
import { User } from './things';
```
3. Define it
``` jsx
export const UserContext = createContext<User | undefined>(undefined);
```
This creates two possibilities, either that the user is a User component, or that it is undefined.
4. Wrap your application with 'UserContext.Provider'
``` jsx
const App = ({ user }) => {
  return (
    <UserContext.Provider value={user}>
      <Dashboard />
    </UserContext.Provider>
  );
};

```
5. Access the data in a child component
``` jsx
const Dashboard = () => {
  const user = useContext(UserContext);

  return (
    <div>
      {user ? (
        <p>Welcome, {user.name}!</p>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};

```
This retrieves the `user` data from `UserContext` and displays it.