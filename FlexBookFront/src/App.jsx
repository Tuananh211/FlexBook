import React, { useState } from "react";
import "./assets/css/bootstrap.min.css";
import "./assets/css/style.css";
import FeedPage from "./feed";
import LoginPage from "./login";
import { BrowserRouter, Route, Routes } from "react-router-dom";
// import FeedPage from "./login";
const App = () => {
  const [id, setId] = useState("");
  return (
    <>
      {/* <BrowserRouter>
        {id ? (
          <Routes>
            <Route path="/feed" element={<FeedPage/>}></Route>
          </Routes>
        ) : (
          <Routes>
            <Route
              path=""
              element={
                <LoginPage
                  onSubmit={async (username, password) => {
                    const response = await fetch(
                      `http://localhost:8080/user/login?username=${username}&password=${password}`,
                      {
                        method: "GET",
                        // headers: {
                        //   "Content-Type": "application/json",
                        // },
                        // body: JSON.stringify({ username, password }),
                      }
                    );
                    const id1 = await response.json();
                    console.log(id1);
                    setId(id1);
                  }}
                />
              }
            />
          </Routes>
        )}
      </BrowserRouter> */}
      <FeedPage></FeedPage>
      {/* <FeedPage></FeedPage> */}
      {/* <LoginPage /> */}
    </>
  );
};
export default App;
