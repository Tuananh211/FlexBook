import React from "react";
import "./assets/css/bootstrap.min.css";
import "./assets/css/style.css";
import Appbar from "./Component/Appbar/Appbar";
import LoginPage from "./login";
// import FeedPage from "./login";
const App = () => {
  return (
    <>
      {/* <FeedPage></FeedPage> */}
      <LoginPage />
    </>
  );
};
export default App;
